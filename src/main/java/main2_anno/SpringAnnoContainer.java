package main2_anno;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import di02.AlarmDevice;
import di02.Executor;
import di02.HomeController;
import di02.InfraredRaySensor;
import di02.MonitorViewer;
import di02.SnsAlarmDevice;
import di02.Viewer;
import di02.Worker;

@Configuration   //컨테인너 임
public class SpringAnnoContainer {
	
	@Bean
	public Executor  executor() {
		Executor executor = new Executor();
		executor.setWorker(worker());
		return executor;
	}
	
	@Bean
	public Worker  worker() {
		return new Worker();
	}
	
	@Bean
	public HomeController  homeController() {
		HomeController homeController=new HomeController();
		List<InfraredRaySensor> sensors = new ArrayList<InfraredRaySensor>();
		sensors.add(windowSensor());
		sensors.add(doorSensor());
		homeController.setSensors(sensors);
		homeController.prepare(alarmDevice(), viewer());
		return homeController;
	}
	@Bean
	public AlarmDevice alarmDevice() {
		return new SnsAlarmDevice();
	}
	@Bean
	public Viewer viewer() {
		MonitorViewer viewer=new MonitorViewer();
	
		return viewer;
	}
	
	
	@Bean
	public InfraredRaySensor windowSensor() {
		return new InfraredRaySensor("창센서");
	}
	@Bean
	public InfraredRaySensor doorSensor() {
		return new InfraredRaySensor("현관센서");
	}
	
}
