package kdata.test;

import java.util.Scanner;

public class SecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
	while(true){
	   if(a>b && a>c)
	   {
		   System.out.println(a);
		   a = 0;
	   }
	   else if(b>a && b>c)
	   {
		   System.out.println(b);
		   b = 0;
	   }
	   else
	   {
		   System.out.println(c);
		   c = 0;
	   }
	   
	   if(a == 0 && b ==0 && c ==0)
		   break;
	}
	}
}
