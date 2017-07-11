package kdata.sort;

import java.util.Comparator;

public class MyComparater implements Comparator<Integer> {
	//Comparator<T> T는 비교할 타입 넣기
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1; // o1-o2는 오름차순으로 정렬  or  o2-o1은 내림차순으로 정렬
	}
	

}
