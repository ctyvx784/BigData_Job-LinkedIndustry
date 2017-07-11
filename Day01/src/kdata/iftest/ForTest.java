package kdata.iftest;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
			System.out.println();
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i; j++)
				System.out.print("*");
			
				System.out.println();	
		}
		for(int i=5; i>=0; i--)
		{
			for(int j=i; j>=0; j--)
				System.out.print("*");
			
			System.out.println();
		}
	}

}
