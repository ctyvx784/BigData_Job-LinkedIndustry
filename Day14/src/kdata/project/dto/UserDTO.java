package kdata.project.dto;

import java.io.Serializable;
import java.sql.Date;

/*
Stream에서 객체를 직렬화 시키기 위해 Serializable 인터페이스를 implements 한다.
특이 사항은로는 overriding을 할 메소드는 없다.*/

public class UserDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4226137163490842665L;

	public UserDTO(){};
	
	private String id,pw,name,fileName;
	private Date regDate;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
