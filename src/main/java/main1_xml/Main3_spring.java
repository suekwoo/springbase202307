package main1_xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import di01.Greeter;
import di01.MessageBean;

public class Main3_spring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext container 
		= new GenericXmlApplicationContext("classpath:main1_xml/Container.xml");
		
		System.out.println("2==================");
		MessageBean  bean = container.getBean("message", MessageBean.class);
		bean.sayHello("smith");
		System.out.println("ok");
		Greeter g1 = container.getBean("greeter", Greeter.class);
		Greeter g2 = container.getBean("greeter", Greeter.class);
		System.out.println(g1.greet("smith"));
		System.out.println(g1==g2);
	}

}
