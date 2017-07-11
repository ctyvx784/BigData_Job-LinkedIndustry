package kdata.exceptions;

public class MyExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try{
				int b = 300000000;
				int a = 300000 * b;
			throw new MyException("생성자 #1");
			}catch(MyException e)
			{
				System.out.println("컴파일 오류");
				e.printStackTrace();
			}
	}

}

