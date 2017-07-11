package kdata.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 학생 정보 추가
		// 2. 학생 리스트 이름으로 오름차순 정렬
		// 3. 종료 - 3번 누르면 종료
		Scanner sc = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		int num;
		while(true)
		{
			num = sc.nextInt();
			if(num == 1)
			{
				System.out.println("추가");
				sm.add(new Student(sc.nextInt(), sc.next(), sc.next(), sc.next()));
			}
			else if(num == 2)
			{
				System.out.println("출력");
				sm.print();
				
			}
			else if(num ==3)
			{
				sm.remove(sc.next());
			}
			else if(num ==4)
			{
				sm.serch(sc.next());
			}
			else if(num == 5)
			{
				System.out.println("종료");
				break;
			}
		}
	}

}
