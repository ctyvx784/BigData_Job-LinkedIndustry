package kdata.statictest;

public  class Marine {

		//�ν��Ͻ� �ʵ� //��ü�� ������ �������(��ü ������ new�Ҷ�:heap) �����Ŀ�
	    //main ����� new �ҋ� �޸� �Ҵ� 
		int hp;
		
		//Ŭ���� �ʵ� : Ŭ������ �ϳ��� ������ ������� (�޼ҵ念����:stack) ��������
		//Ŭ���� �ε��ҋ� �޸��Ҵ� Ŭ������ ���� Marine.level�� 
		
		 
		public static int level;
		
		//�ν��Ͻ� �޼ҵ�
		void setHp()
		{
			this.hp = 100;			
		}
		//Ŭ���� �޼ҵ� this��� �Ұ�
		
		static void setlevel()
		{
			level = 100;
		}
		
}
