package main2_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import di02.Executor;
import di02.HomeController;
import di02.InfraredRaySensor;
import di02.WorkUnit;
public class MainConfig {
	public static void main(String[] args) {
		ApplicationContext container =
		new AnnotationConfigApplicationContext(SpringAnnoContainer.class);
		System.out.println("=================container ok");
		
		Executor  executor = container.getBean("executor", Executor.class);
		executor.addUnit(new WorkUnit());
		executor.addUnit(new WorkUnit());
		HomeController home = container.getBean("homeController",HomeController.class);
		home.checkSensorAndAlarm(); //출력정보 없음
		home.showCameraImage();
		System.out.println(home);
		InfraredRaySensor windowSensor = 
				container.getBean("windowSensor",InfraredRaySensor.class);
		windowSensor.foundObject(); //windowSensor()   :  objectFounded=true
	    home.checkSensorAndAlarm();
	    System.out.println("ok");
	}
}
