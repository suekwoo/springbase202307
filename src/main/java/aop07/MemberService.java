package aop07;

public interface MemberService {

	void regist(Member member);
	boolean update(String memberId, UpdateInfo info);
	boolean delete(String id, String str);
	
}
