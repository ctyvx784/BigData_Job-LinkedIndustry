package kdata.sort;

import java.util.Comparator;

public class Student implements Comparable <Student>  {

	private int num;
	private String name;
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.num - o.num;
	}


	
	
	
	
	
}
