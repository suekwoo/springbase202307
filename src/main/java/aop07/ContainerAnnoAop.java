package aop07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;




@Configuration //설정을 위한 자바 프로그램
@ComponentScan(basePackages = {"aop07"})//객체화되는 패키지 설정
@EnableAspectJAutoProxy //annotation으로 AOP를 사용 설정.
public class ContainerAnnoAop {
	@Bean
	public MemberService memberService2() {
		return new MemberServiceImpl();
	}	
}
