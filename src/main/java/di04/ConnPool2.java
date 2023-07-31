package di04;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ConnPool2 {

	public ConnPool2() {
		System.out.println("ConnPool2 생성자");
	}
	
	@PostConstruct
	public void initPool() {
		System.out.println("ConnPool2.initPool()");	}
	
	@PreDestroy
	public void destroyPool() {
		System.out.println("ConnPool2.destroyPool()");	}

	
	
}
