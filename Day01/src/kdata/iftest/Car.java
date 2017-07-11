package kdata.iftest;

public class Car {
	
	int CarNumber;
	String color;
	
	
	
	//메소드 정의
	
	public void setNum(int num)
	{
		this.CarNumber = num;
	}
	public int getNum()
	{
		return this.CarNumber;
	}
	public int num(int number)
	{
		CarNumber = number;
		return CarNumber;
	}
	public String colorcar(String color1)
	{
		color = color1;
		return color;
	}
	public void print()
	{
		System.out.println("자동차 클래스 출력");
		System.out.println(this.color);
	}
	public int cmul(int a)
	{
		
		return a*a;
	}
	public void setColor(String text)
	{
		this.color = text;
		//System.out.println(color);
	}
	public String getColor(){
	
		return this.color;

	}

}
