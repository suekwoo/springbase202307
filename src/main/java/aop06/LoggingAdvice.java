package aop06;

public class LoggingAdvice {
	public void before() {
		System.out.println("[LA-before]메서드 실행 전 전처리 수행함.");
	}
	
	public void afterReturning(Object ret) {  //return type
		System.out.println("[LA-afterReturning]메서드 정상 처리 후 수행함  리턴값:" + ret);
	}
	
	public void afterThrowing(Throwable ex) {
		System.out.println("[LA-afterThrowing]메서드 예외 발생 후 수행함 예외:" + ex.getMessage());
	}
	
	public void afterFinally() {
		System.out.println("[LA-afterFinally]메서드 실행 후 후처리 수행함");
	}
}
