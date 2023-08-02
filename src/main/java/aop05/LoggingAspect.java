package aop05;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class LoggingAspect {
	
	public Object logging(ProceedingJoinPoint joinPoint)
			throws Throwable{
		System.out.println("[LA]로그 시작 ");
		StopWatch sw = new StopWatch();
		sw.start(); //시작
		Object ret = joinPoint.proceed(); 
		//다음 메서드 호출. 여기서는 핵심알고리즘.
		sw.stop();
		System.out.println("[LA]메서드 실행 시간:"
		+sw.getTotalTimeMillis() + "밀리초");
		return ret;
	}

}