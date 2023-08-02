package aop06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_aop06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] config = {"aop06/di06.xml","aop06/aop06.xml"};
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext(config);
		
		ReadArticleService service = ctx.getBean
				("readArticleService",ReadArticleService.class);
		Article a1;
		try {
			a1 = service.getArticleAndReadCnt(1);
			System.out.println("[main]a1=" + a1);
			Article a2 = service.getArticleAndReadCnt(1);
			System.out.println("[main]a1=a2 :" + (a1==a2));
			service.getArticleAndReadCnt(0);
		} catch (ArticleNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[main]===" + e.getMessage());
		}
		
		System.out.println("\n UpdateMemberInfoTraceAspect 연습");
		MemberService ms =
				  ctx.getBean("memberService",MemberService.class); 
		ms.regist(new Member());
		ms.update("hong", new UpdateInfo());
		ms.delete("hong2", "test");
		System.out.println("\n=========main.MemberService 객체 연습");
		MemberService ms2 =
		  ctx.getBean("memberService2",MemberService.class); 
		ms2.regist(new Member());
		ms2.update("hong", new UpdateInfo());
		ms2.delete("hong2", "test");
		
		
		System.out.println("ok");
	}

}
