package kdata.iftest;
import java.util.Scanner;
public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,sum = 0;
		i = sc.nextInt();
		for(int k = 1; k<=i; k+=2)
			sum += k;
		
		System.out.println(sum);
        
	}

}
