package constructor;

public class Car {
	int num;
	String color;
	
	Car(){
		System.out.println("Car() »ý¼ºÀÚ");
		this.num = 0;
		this.color = "black";
	}
	
	Car(String color)
	{
		this.color = color;
	}
	Car(int num,String color)
	{
		this.num = num;
		this.color = color;
	}

	 
}
