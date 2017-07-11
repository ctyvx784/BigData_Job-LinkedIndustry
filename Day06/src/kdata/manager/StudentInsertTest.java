package kdata.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentInsertTest {

	public static void main(String[] args) {
		// 1. JDBC 드라이버 로드
		Scanner sc = new Scanner(System.in);
		try {
			// 패키지 이름 + jdbc 드라이버 이름 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC load success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("JDBC load failed");
		}
		// 2. 데이터베이스 서버 연결
		// Connection 객체 생성
		
		//정수형이 아니라서 null로 초기화, 자바는 지역변수 무조건 초기화해줘야
		//클래스안에 필드로 들어가있는 애들은 자동 초기화됨
		Connection con = null;
		try {
			// 작은 따옴표 - database에서 문자열이라는 것을 알려주는 것, 큰 따옴표 - 자바에서 문자열이라는 것을 알려줌
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:DBSERVER", "test", "1234");
			System.out.println("서버연결 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("서버연결 실패");
		}
		// 3. Statement 객체 생성
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 4. SQL문 전송
		int result = 0;
		System.out.println("input Student ID");
		String StudentID = sc.nextLine();
		System.out.println("input Student Name");
		String StudentName = sc.nextLine();
		System.out.println("input Student's gender");
		String Gender = sc.nextLine();
		
		try {
			String sql = "insert into student values('"+ StudentID +"','"+StudentName+"','"+Gender+"')";
			System.out.println(sql);
			result = st.executeUpdate(sql);
			
			System.out.println(result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 5. 결과 처리
		if(result == 0) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
			
		// 6. 데이터베이스 서버 연결 해제
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
