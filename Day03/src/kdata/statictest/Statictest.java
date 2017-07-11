package kdata.statictest;

public class Statictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		m1.hp = 100;
		//System.out.println(m1.hp);
		//System.out.println(m2.hp);
		Marine.level = 10;
		//m2.level = 300;
		System.out.println(Marine.level);
		
	}

}
