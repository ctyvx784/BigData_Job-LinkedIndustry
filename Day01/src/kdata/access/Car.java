package kdata.access;


public class Car {

	
	private int num;
	private String color;
	private double cc;


	public int num(int num)
	{
		this.num = num;
		//System.out.println(num);
		return num;
	}
	public int squard(int num)
	{
		this.num = num;
		//System.out.println(num);
		return num*num;
	}
	public void setnum(int num)
	{
		this.num = num;
	}
	public int getnum()
	{
		return num;
	}
	public void setcolor(String color)
	{
		this.color = color;
	}
	public String getcolor()
	{
		return color;
	}
	public void setcc(double cc)
	{
		this.cc = cc;
	}
	public double getcc()
	{
		return cc;
	}
	
	public void test()
	
	{
		this.equals("");
	}
	@Override
	public boolean equals(Object obj) {
		boolean test = false;
		return test;
	}
	
}
