package kdata.object;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		String s3 = "hello";
		String s4 = "hello";
		
		//System.out.println(s1.hashCode());
	//	System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2);
		
		System.out.println(s3.hashCode());
		
		s3 = s3 + "!";
		System.out.println(s3.hashCode());
		
		System.out.println(s3 == s4);
		
		
	}

}
