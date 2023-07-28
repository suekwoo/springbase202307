package main3_xmlAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di03.Executor;
import di03.HomeController;
import di03.InfraredRaySensor;
import di03.WorkUnit;



public class mainAnnoXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] config = {"main3_xmlAnno/SpringContainer.xml"};
		ApplicationContext container = 
				new ClassPathXmlApplicationContext(config);
		String[] containers = container.getBeanDefinitionNames();
		for (String str : containers) {
			System.out.println(str);
		}
		Executor  executor = container.getBean("executor", Executor.class);
		executor.addUnit(new WorkUnit());
		executor.addUnit(new WorkUnit());
		
		HomeController home = container.getBean("homeController",HomeController.class);
		home.checkSensorAndAlarm(); //출력결과 없음
		home.showCameraImage();
		InfraredRaySensor windowSensor = 
				container.getBean("windowSensor",InfraredRaySensor.class);
	     windowSensor.foundObject();
	//문제 : 현관 센서에서 침입 탐지됨을 출력하기
	/*
	 * InfraredRaySensor doorSensor = //new InfraredRaySensor("현관센서");
	 * ctx.getBean("doorSensor",InfraredRaySensor.class); doorSensor.foundObject();
	 */
	     InfraredRaySensor lampSensor =  //new InfraredRaySensor("현관센서"); 
	    		 container.getBean("lampSensor",InfraredRaySensor.class);
	     lampSensor.foundObject();
	     home.checkSensorAndAlarm();
		System.out.println("ok");		
	}
	}
