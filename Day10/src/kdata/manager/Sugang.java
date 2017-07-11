package kdata.manager;

import java.sql.Date;

public class Sugang {
	private String stuId;
	private String sName;
	private String gender;
	private String subCode;
	private int grade;
	private Date classDate;
	private String subName;
	private double Dgrade;
	
	public double getDgrade() {
		return Dgrade;
	}

	public void setDgrade(double dgrade) {
		Dgrade = dgrade;
	}

	public Sugang(String stuId, String subCode, int grade) {
		super();
		this.stuId = stuId;
		this.subCode = subCode;
		this.grade = grade;
	}
	
	public Sugang(String subName,int grade) {
		super();
		this.subName = subName;
		this.grade = grade;
	}

	public Sugang(String stuId, String subCode, int grade, Date classDate) {
		super();
		this.stuId = stuId;
		this.subCode = subCode;
		this.grade = grade;
		this.classDate = classDate;
	}



	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Date getClassDate() {
		return classDate;
	}
	public void setClassDate(Date classDate) {
		this.classDate = classDate;
	}

	
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Sugang [stu_num=" + stuId + ", sub_code=" + subCode + ", sign_grade=" + grade + ", sign_date=" + classDate
				+ "]";
	}
	
	
	
	
}
