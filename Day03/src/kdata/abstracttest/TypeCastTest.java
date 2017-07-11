package kdata.abstracttest;

public class TypeCastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 형변환 테스트
		// instanceof 테스트 반환값 true false
		    Marine m = new Marine();
			//System.out.println(m instanceof Marine);
			//System.out.println(m instanceof unit);
			//System.out.println(m instanceof Object);
			
			//자동 형변환
			unit u = new Marine();
			unit u2 = new Medic();
			u.move();
			u2.move();
			System.out.println(u instanceof unit);
			System.out.println(u instanceof Marine);
			Marine m2 = (Marine)u;
			m2.move();
			
			Object o = new Marine();
			System.out.println(o instanceof Object);
			System.out.println(o instanceof Marine);
			
			Object o2 = new Object();
			
			
	}

}
