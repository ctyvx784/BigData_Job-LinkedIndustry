package kdata.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListTest {

	//<>제너릭 -> 타입파라미터(요소)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		int[] a = new int[5];
 
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		list.add("2");
		list.add("Hello");
		list.add("Hello2");
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i).charAt(0));
		
		for(String s : list)
			System.out.println(s);
		
		for(int c : a)
			System.out.println(c);
		
		
	}

}
