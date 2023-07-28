package di01;

import java.util.Date;

public class Member {
	private Long id;	
	private String email;
	private String password;	
	private String name;	
	private Date registerDate;
	
	

	
	public Member(Long id, String email, String password, 
			String name, Date registerDate) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}

	// setter/getter
	void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public Date getRegisterDate() {
		return registerDate;
	}
	
	public void changePassword(String oldPw, String newPw) {
		if (!password.equals(oldPw))
			throw new IdPasswordNotMatchingException();
		this.password = newPw;
	}

	
}
