package kdata.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �л� ���� �߰�
		// 2. �л� ����Ʈ �̸����� �������� ����
		// 3. ���� - 3�� ������ ����
		Scanner sc = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		int num;
		while(true)
		{
			num = sc.nextInt();
			if(num == 1)
			{
				System.out.println("�߰�");
				sm.add(new Student(sc.nextInt(), sc.next(), sc.next(), sc.next()));
			}
			else if(num == 2)
			{
				System.out.println("���");
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
				System.out.println("����");
				break;
			}
		}
	}

}
