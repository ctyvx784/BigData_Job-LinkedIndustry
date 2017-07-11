package kdata.object;

public class ObjectEqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		//System.out.println(o1.equals(o2));
		//System.out.println(o1.equals(o3));
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
