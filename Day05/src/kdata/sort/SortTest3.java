package kdata.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student(201002475,"������"),new Student(201302475,"�ƹ���"),
				new Student(201402475,"ȫ�浿"),new Student(201502475,"��⸮"),new Student(201602475,"�̼���"));
		
		System.out.println(list);
		Collections.sort(list , new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		System.out.println(list);
		
		/*Collections.sort(list, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getNum() -o2.getNum();
			}

		
			
		});
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				
				return 	o1.getName().compareTo(o2.getName());
			}
			
		});
		System.out.println(list);*/
	}

}
