package di03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   //bean이란 뜻 : package의 내용을 context-component-scan 
public class Executor {
	
	@Autowired  //container에서 Worker.class  type를 찾아 적용한다
	Worker worker;
	
	public void addUnit(WorkUnit workUnit) {
		worker.work(workUnit);
	}
	
	public void setWorker(Worker worker) {
		this.worker=worker;
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