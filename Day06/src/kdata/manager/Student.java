package kdata.manager;

public class Student {
	private String stu_num;
	private String stu_name;
	private String stu_gender;
	
	public String getStuid() {
		return stu_num;
	}
	
	public Student(String stuid, String sname, String gender) {
		super();
		this.stu_num = stuid;
		this.stu_name = sname;
		this.stu_gender = gender;
	}
	
	public void setStuid(String stuid) {
		this.stu_num = stuid;
	}
	public String getSname() {
		return stu_name;
	}
	public void setSname(String sname) {
		this.stu_name = sname;
	}
	public String getGender() {
		return stu_gender;
	}
	public void setGender(String gender) {
		this.stu_gender = gender;
	}
	
	
}
