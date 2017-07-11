package kdata.switchtest;

import java.util.Scanner;
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++)
			a[i] = sc.nextInt();
		
		for(int i=0; i<a.length; i++){
		switch(a[i]/10)
		{
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;	
		default :
			System.out.println("F");
		}
	 }
	}

}
