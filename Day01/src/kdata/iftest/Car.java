package kdata.iftest;

public class Car {
	
	int CarNumber;
	String color;
	
	
	
	//�޼ҵ� ����
	
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
		System.out.println("�ڵ��� Ŭ���� ���");
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
