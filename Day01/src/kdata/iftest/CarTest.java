package kdata.iftest;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cn,cn1;
		String cc,cc1,cc2;
		
		Car car = new Car();
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		cn = car.num(2);
		cc = car.colorcar("blue");
		cn1 = car.CarNumber = 1;
		cc1 = car.color = "red";
		System.out.println(car.color);
		car1.CarNumber = 3;
		car1.color = "aaa";
		car.print();
		car1.print();
		car.setColor("Green");
		System.out.println(car.color);
		car3.color = "pk";
		System.out.println(car3.color);
		car3.setColor("blue");
		System.out.println(car3.color);
		System.out.println(car.getColor());
		cc2 = car3.getColor();
		System.out.println(cc2);
		car.setNum(3);
		System.out.println(car.getNum());
		//car1.setColor("blue");
		//System.out.println(car.cmul(2));
	}

}
