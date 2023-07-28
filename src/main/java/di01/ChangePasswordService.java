package di01;

public class ChangePasswordService {
	MemberDaoInterface  dao;
	public ChangePasswordService(MemberDaoInterface  dao) {
		System.out.println("MemberDaoInterface  dao  연결");
		this.dao=dao;
	}
	
	
	public void changePassword(String email, String oldPw, String newPw) {
		Member member = dao.selectByEmail(email);
		if(member == null) 
			throw new MemberNotFoundException();
		member.changePassword(oldPw, newPw);
		dao.update(member);
	}
}
