package kdata.exceptions;

public class MyRuntimeException extends RuntimeException {
	
	public MyRuntimeException(){
		super("MyRuntimeException");
		System.out.println("MyRuntimeException ������ #1");
	}
	public MyRuntimeException(String message)
	{
		super(message);
		System.out.println(message);
	}
	

}
