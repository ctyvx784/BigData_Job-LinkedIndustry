package kdata.inheritance;

public class Car extends Vehicle {
	
		String name;
		
		@Override
		void move()
		{
			
			System.out.println("car move");
			super.move();
		}

}
