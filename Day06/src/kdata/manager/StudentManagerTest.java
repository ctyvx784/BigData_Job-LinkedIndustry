package kdata.manager;

import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 학생 정보 추가
		// 2. 학생 리스트 출력
		// 3. 학생 이름 검색
		
		StudentManager mg = new StudentManager();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("input 1 to add Student Info");
			System.out.println("input 2 to print Student Info");
			System.out.println("input 3 to search Student Info");
			System.out.println("input 4 to exit");
			
			int input = sc.nextInt();
			
			// 1번 학생 정보 추가
			if(input == 1){
				System.out.println("input Student ID");
				String StudentID = sc.nextLine();
				System.out.println("input Student Name");
				String StudentName = sc.nextLine();
				System.out.println("input Student's gender");
				String Gender = sc.nextLine();
				
				//학생 객체 생성
				Student s = new Student(StudentID, StudentName, Gender);
				
				//학생 객체 추가
				mg.insert(s);
			}
			
		}
		
		
	}

}
