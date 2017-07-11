package kdata.object;

public class ObjectToStringMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object o = new Object();
		Car c1= new Car(3,"red");
		Car c2 = new Car(3,"red");
		//System.out.println(c);
		//System.out.println(o.hashCode());
		//System.out.println(c.getNum());
		//System.out.println(c.getColor());
		
		//String s = new String("Good");
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);

	}

}
