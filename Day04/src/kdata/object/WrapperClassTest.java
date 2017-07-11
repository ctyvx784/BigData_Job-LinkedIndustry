package kdata.object;

public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		Integer i2 = new Integer(i);
		Integer i3 =  10;
		
		String s1 = "10";
		String s2 = "20";
	
		System.out.println(i3.parseInt(s1)+i2.parseInt(s2) );
	}

}
