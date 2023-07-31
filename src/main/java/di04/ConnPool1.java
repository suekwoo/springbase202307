package di04;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ConnPool1 implements InitializingBean, DisposableBean{

	public ConnPool1() {
		System.out.println("ConnPool1 생성자");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("ConnPool1.destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ConnPool1.afterPropertiesSet");
		
	}

	
	
}
