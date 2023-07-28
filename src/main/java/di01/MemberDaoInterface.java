package di01;

import java.util.Collection;

public interface MemberDaoInterface {
	 Member selectByEmail(String email);
	  void insert(Member member);
	  void update(Member member);
	  Collection<Member> selectAll();
	
}
