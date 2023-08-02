package aop07;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UpdateMemberInfoTraceAdvice {
	
	@AfterReturning(pointcut = "args(id,info)", 
			argNames = "ret,id,info", returning = "ret")
	public void traceReturn(boolean result, String memberId, UpdateInfo info) {
		System.out.println("[TA] 정보 수정 : 결과=" + result + ", 대상회원=" + memberId
				     + ", 수정정보="+ info);
	}
}
