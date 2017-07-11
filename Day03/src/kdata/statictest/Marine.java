package kdata.statictest;

public  class Marine {

		//인스턴스 필드 //객체당 변수가 만들어짐(객체 생성시 new할때:heap) 실행후에
	    //main 실행시 new 할떄 메모리 할당 
		int hp;
		
		//클래스 필드 : 클래스당 하나의 변수만 만들어짐 (메소드영역에:stack) 실행전에
		//클래스 로드할떄 메모리할당 클래스로 접근 Marine.level로 
		
		 
		public static int level;
		
		//인스턴스 메소드
		void setHp()
		{
			this.hp = 100;			
		}
		//클래스 메소드 this사용 불가
		
		static void setlevel()
		{
			level = 100;
		}
		
}
