package kdata.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(6,71,452,5645,67567,1,3);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,new MyComparater());
		//Collections.sort(list,new MyComparater());
		System.out.println(list);
	}

}

