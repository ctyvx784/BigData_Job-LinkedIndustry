package kdata.iftest;
import java.util.Scanner;
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
     int[] num;
     int c, sum = 0, avg = 0;
     
     c = sc.nextInt();
     num = new int[c];
     for(int i=0; i<num.length; i++)
    	sum +=  num[i] = sc.nextInt();

     System.out.println();
     
     for(int i=0; i<num.length; i++)
     	System.out.println(num[i]);

     avg = sum/c;
     System.out.println("��:"+sum);
     System.out.println("���:"+avg);
     System.out.println("�迭ũ��:"+num.length);
	}

}
