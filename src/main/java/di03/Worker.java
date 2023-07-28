package di03;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Worker {
	
	public void work(WorkUnit workUnit) {
		System.out.println(this+ ":work"+workUnit);
	}

}

/*
 * 어노테이션
 * @Component : 클래스위에 구현. 
 *              클래스를 객체화 하여 컨테이너에 저장. 객체의 이름(소문자로 시작하는 클래스이름)
 * @Autowired : 변수선언시 구현(선언된 자료형), 메서드선언부(매개변수 자료형) 위에 구현. 
 *             컨테이너에 저장된 객체 중 자료형이 일치하는 객체를 주입.
 * @Scope(...) : 객체를 주입할때 재사용을 안하고, 일회용으로 주입함(prototype). 재사용시에는 다시 객체를 생성함.                   
 */ 
