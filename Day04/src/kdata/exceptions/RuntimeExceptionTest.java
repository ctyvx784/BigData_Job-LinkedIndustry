package kdata.exceptions;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		a = 10;
		System.out.println(2/a);
		a = 0;
		try{
			System.out.println("try Ω√¿€");
			System.out.println(2/0);
			String s = null;
			System.out.println(s.charAt(1));
			System.out.println("try ≥°");
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		finally{
			System.out.println("finally");
		}
		
		//System.out.println("123");
		

	}

}
