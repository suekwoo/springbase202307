package di01;

import java.util.Date;

public class MemberRegisterService {
	private MemberDaoInterface dao;
	public MemberRegisterService() {}
	public MemberRegisterService(MemberDaoInterface dao) {  //(new MemberDao())
		System.out.println( "MemberRegisterService 실행 됩니다");
		this.dao = dao;	}
	//req : 입력한 값을 저장하고 있는 객체
	public void regist() {
		System.out.println(dao+ "입니다");
	}

	public void regist(RegisterRequest req) {
		Member member = dao.selectByEmail(req.getEmail());
		if(member != null) { //등록된 이메일
			throw new AlreadyExistingMemberException
			("email 중복 " + req.getEmail());
		}
		Member newMember = 
				new Member(0L,req.getEmail(),req.getPwd(),req.getName(),
				new Date());
		dao.insert(newMember);	}	}