package di01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberOracle implements  MemberDaoInterface{
	private static long nextId = 0;
	private Map<String,Member> map = new HashMap<>();
	
	public Member selectByEmail(String email) {
		return map.get(email); //Member 객체 리턴
	}
	public void insert(Member member) {
		System.out.println("oracle 이다");
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}
	public Collection<Member> selectAll() {
		return map.values();
	}
}
