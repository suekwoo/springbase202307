package di03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HomeController {
	private List<InfraredRaySensor> sensors;
	private AlarmDevice alarmDevice;
	private Viewer viewer;

	@Autowired
	public void prepare(AlarmDevice alarmDevice, Viewer viewer) {
		this.alarmDevice = alarmDevice;
		this.viewer = viewer;
	}

	// setter injection
	@Autowired
	@Qualifier("intrusionDetection")
	/*
	List<InfraredRaySensor> sensors : 
	           container에 있는 모든 제네릭객체를 가지고 온다 
	@Qualifier("intrusionDetection"):
	       해당하는 @Qualifier 이름에 해당하느 것을 가지고 온다 
	 */
	public void setSensors(List<InfraredRaySensor> sensors) {
		System.out.println(sensors);
		this.sensors = sensors;
		for (InfraredRaySensor s : sensors) {
			System.out.println("센서 등록:" + s);
		}
	}
	
	

	public void checkSensorAndAlarm() {
		for (InfraredRaySensor s : sensors) {
			if (s.isObjectFounded()) {
				alarmDevice.alarm(s.getName());
			}
		}
	}

	public void showCameraImage() {
		viewer.draw(); //
	}

}
