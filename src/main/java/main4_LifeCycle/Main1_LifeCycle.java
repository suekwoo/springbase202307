package main4_LifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main1_LifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== XML Meta =====");
		String configLocation = "classpath:main4_LifeCycle/LifeCycle.xml";
		AbstractApplicationContext ctx =
				new GenericXmlApplicationContext(configLocation);
		ctx.close();
		
		
		
		System.out.println("===== Java Meta =====");
		AnnotationConfigApplicationContext ctx2 
		= new AnnotationConfigApplicationContext(LifeCycleAnnotation.class);
		ctx2.close();	}
	}


