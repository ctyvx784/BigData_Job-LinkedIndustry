package kdata.exceptions;

public class MyRuntimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRuntimeException m = new MyRuntimeException();
		MyRuntimeException m2 = new MyRuntimeException("持失切 #2");
		MyRuntimeException m3 = new MyRuntimeException("持失切 #3");
		
		
		try{
			throw m2;
		}catch(MyRuntimeException e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		
		
	}

}
