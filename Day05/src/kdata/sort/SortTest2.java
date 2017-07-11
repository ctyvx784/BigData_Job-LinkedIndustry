package kdata.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("�ƹ���","ȫ�浿","�̼���","�庸��");
		
		Collections.sort(list);
		System.out.println("��������: "+list);
		
		
		Collections.sort(list, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		
		System.out.println("��������: "+list);	
	}

}
