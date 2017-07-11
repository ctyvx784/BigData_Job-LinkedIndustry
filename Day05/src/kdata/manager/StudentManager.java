package kdata.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
	
	 static public List<Student> list = new ArrayList<>();
	
	public  void add(int num, String name, String callnum , String address)
	{
		list.add( new Student(num, name, callnum, address));
	}
	public void remove(String name)
	{
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getName().equals(name))
				  list.remove(i);
		}
	}
	public void serch(String name)
	{
		for(Student s : list)
		{
			if(s.getName().equals(name))
			{
				System.out.println("     학번                            이름                            전화번호                            주소");
				System.out.println(s.getNum()+"        "+s.getName()+"              "+s.getCallnum()+"        "+s.getAddress());
			}
		}
	}
	
	public void add(Student s)
	{
		list.add(s);
	}
	public void print()
	{
		System.out.println("     학번                            이름                            전화번호                            주소");
		Collections.sort(list, new Comparator<Student>(){

			@Override
			public int compare(Student arg0, Student arg1) {
				// TODO Auto-generated method stub
				return arg0.getName().compareTo(arg1.getName());
			}
			
			
		});
		
		for(Student s : list)
			System.out.println(s.getNum()+"        "+s.getName()+"              "+s.getCallnum()+"        "+s.getAddress());
	}
}
