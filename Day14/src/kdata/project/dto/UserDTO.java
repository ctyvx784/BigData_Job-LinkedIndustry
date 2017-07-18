package kdata.project.dto;

import java.io.Serializable;
import java.sql.Date;

/*
Stream에서 객체를 직렬화 시키기 위해 Serializable 인터페이스를 implements 한다.
특이 사항은로는 overriding을 할 메소드는 없다.*/

public class UserDTO implements Serializable {

	private String id;
	private String pw;
	private String name;
	private String profile;
	private Date regDate;
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public UserDTO(String id, String name, String profile, Date regDate) {
		super();
		this.id = id;
		this.name = name;
		this.profile = profile;
		this.regDate = regDate;
	}
	public UserDTO(String id, String pw, String name, String profile) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.profile = profile;
	}
	
}
	

	
