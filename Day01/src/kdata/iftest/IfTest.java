package kdata.iftest;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
	
		
		if(num < 0)
			System.out.println("����");
		else if(num == 0)
			System.out.println("0");
		else
			System.out.println("���");
		
		
		
		
		if(num%2 == 0)
			System.out.println("¦��");
		else
			System.out.println("Ȧ��");
		
		
		
	
	}

}
