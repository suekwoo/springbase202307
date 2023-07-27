package main1_xml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.support.GenericXmlApplicationContext;

import di01.AlreadyExistingMemberException;
import di01.ChangePasswordService;
import di01.Greeter;
import di01.IdPasswordNotMatchingException;
import di01.MemberNotFoundException;
import di01.MemberRegisterService;
import di01.MessageBean;
import di01.RegisterRequest;

public class Main4_spring {
	static GenericXmlApplicationContext container;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		container 
		= new GenericXmlApplicationContext("classpath:main1_xml/Container2.xml");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("명령어를 입력하세요(exit)");
			String command = reader.readLine();
			if(command.equalsIgnoreCase("exit")) { //대소문자 상관없이 exit 문장
				System.out.println("종료합니다.");
				break;
			}
			
			if(command.startsWith("new ")) { //회원등록
				processNewCommand(command.split(" "));
				continue;
			}else if (command.startsWith("change ")) { //비밀번호 변경
				processChangeCommand(command.split(" "));
				continue;	}		
		}
		System.out.println("ok");
	}
	
	private static void processChangeCommand(String[] arg) {
		System.out.println("processChangeCommand");
		if(arg.length != 4) {
			printHelp(); return;
		}
		//arg[0]=change,  arg[1] : 이메일, arg[2]=기존비밀번호, arg[3]=변경할 비밀번호
		
		  ChangePasswordService changePwdSvc =
				  container.getBean("changePwdSvc",ChangePasswordService.class);
		 
		
		try {
			changePwdSvc.changePassword(arg[1],arg[2],arg[3]);
			System.out.println("암호를 변경했습니다.\n");
		} catch(MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.\n");
		} catch(IdPasswordNotMatchingException e) {
			System.out.println("이메일과 암호가 일치하지 않습니다.\n");
		}		
	}
	
	
	private static void processNewCommand(String[] arg) {
		System.out.println("processNewCommand");
		//arg[0]=new, arg[1]=이메일,arg[2]=이름, arg[3]=비밀번호, arg[4]=비밀번호확인 
				if(arg.length != 5) {
					printHelp(); return;
				}
				MemberRegisterService regSvc = 
						container.getBean("memberRegSvc",MemberRegisterService.class);
				
				RegisterRequest req = new RegisterRequest();
				req.setEmail(arg[1]);
				req.setName(arg[2]);
				req.setPwd(arg[3]);
				req.setConfirmPwd(arg[4]);
				
				if(!req.isPasswordEqualToConfirmPassword() ) {
					System.out.println("암호와 확인이 일치하지 않습니다.\n");
					return;
				}
				//비밀번호와 비밀번호 확인이 동일한 경우
				try {
					regSvc.regist(req);
					System.out.println("등록했습니다.\n");
				} catch(AlreadyExistingMemberException e) {
					System.out.println("이미 존재하는 이메일 입니다. \n");
				}
				
				
				
				
	}
	
	
	private static void printHelp() {
		System.out.println("\n잘못된 명령입니다. 아래 명령어 사용법을 확인하세요");
		System.out.println("명령어 사용법:");
		System.out.println("new 이메일 이름 암호 암호확인");
	
	}
}
