package di04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyExtension implements  BeanPostProcessor {

	/*
	 * Container에 BeanPostProcessor가 있으면 
	 * 객체의 setting전에  
	 * postProcessBeforeInitialization
	 * setting 마감후에는 
	 * postProcessAfterInitialization이 실행 된다
	 */
	public  MyExtension() {
		System.out.println("constructor : MyExtension");
	}
	
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeforeInitialization");
		return bean;
	}
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization");
		return bean;
	}
	
}
