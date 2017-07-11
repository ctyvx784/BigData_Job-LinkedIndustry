package kdata.access;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println(c.squard(3));
		
		c.setcolor("red");
		System.out.println(c.getcolor());
		
		c.setnum(5);
		System.out.println(c.getnum());
		
		c.setcc(3.1425);
		System.out.println(c.getcc());
		
		String a =  "3";
		double aa;
		int num;
		num = Integer.parseInt(a);
		aa =  Double.parseDouble(a);
		System.out.println("Çüº¯È¯"+num);
		System.out.println(aa);
	}

}
