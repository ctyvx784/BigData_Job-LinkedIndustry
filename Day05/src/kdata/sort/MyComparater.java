package kdata.sort;

import java.util.Comparator;

public class MyComparater implements Comparator<Integer> {
	//Comparator<T> T�� ���� Ÿ�� �ֱ�
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1; // o1-o2�� ������������ ����  or  o2-o1�� ������������ ����
	}
	

}
