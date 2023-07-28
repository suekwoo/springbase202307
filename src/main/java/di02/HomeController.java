package di02;

import java.util.List;

public class HomeController {	
	private List<InfraredRaySensor> sensors;
	private AlarmDevice alarmDevice;
	private Viewer viewer;	
	
	public void prepare(AlarmDevice alarmDevice, Viewer viewer) {
		this.alarmDevice = alarmDevice;
		this.viewer = viewer;	}	
	//setter injection
		public void setSensors(List<InfraredRaySensor> sensors) {
			this.sensors = sensors;
			for(InfraredRaySensor s : sensors) {
				System.out.println("센서 등록:" + s);
			}		}
		
	public void checkSensorAndAlarm() {
		for(InfraredRaySensor s : sensors) {
			if(s.isObjectFounded()) {
				alarmDevice.alarm(s.getName());
			}		}
	}	
	
	public void showCameraImage() {
		viewer.draw(); //
	}
	
}
