package main4_LifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


import di04.WorkScheduler;

public class Main2_scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== XML Meta =====");
		String configLocation = "classpath:main4_LifeCycle/Scope.xml";
		GenericXmlApplicationContext ctx =	
				new GenericXmlApplicationContext(configLocation);
		
		WorkScheduler scheduler = ctx.getBean("workScheduler", WorkScheduler.class);
		scheduler.makeAndRunWork();
		ctx.close();
		
		
		System.out.println("===== Java Meta =====");
		AnnotationConfigApplicationContext ctx2 =
				new AnnotationConfigApplicationContext(ScopeAnnotation.class);

		WorkScheduler scheduler2 = ctx2.getBean("workScheduler", WorkScheduler.class);
		scheduler2.makeAndRunWork();
		ctx2.close();

	}

}
