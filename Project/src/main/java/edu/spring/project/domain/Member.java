package edu.spring.project.domain;

public class Member {
	private int no;
	private String id;
	private String password;
	private String name;
	private String email;
	private int account;
	private int gamescore;
	
	public Member() {}

	public Member(int no, String id, String password, String name, String email, int account, int gamescore) {
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.account = account;
		this.gamescore = gamescore;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getGamescore() {
		return gamescore;
	}

	public void setGamescore(int gamescore) {
		this.gamescore = gamescore;
	}

}
