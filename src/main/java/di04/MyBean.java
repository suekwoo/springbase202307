package di04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBean implements BeanNameAware, ApplicationContextAware,
                    InitializingBean, DisposableBean {
	public MyBean() {
		System.out.println("MyBean");
	}

	public void customInit() {
		// TODO Auto-generated method stub
		System.out.println("MyBean.customInit");
		
	}
	
	public void customDestroy() {
		System.out.println("MyBean.customDestroy");
		
	}
	
	public void setProperty1(String name) {
		System.out.println("MyBean.setProperty1");
		
	}	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("MyBean.destroy");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyBean.afterPropertiesSet");
		
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("MyBean.setApplicationContext");
		
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("MyBean.setBeanName");
		
	}
	
}