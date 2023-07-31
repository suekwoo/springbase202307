package aop05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;




public class Main_aop05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:aop05/Aop05.xml");
		System.out.println("ok");
		WriteImpl write = ctx.getBean("write",WriteImpl.class);
		
		write.write();
		
		
		ReadImpl read = ctx.getBean("read",ReadImpl.class);
		System.out.println(read.read());
	}

}
