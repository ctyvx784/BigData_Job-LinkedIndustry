package kdata.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentInsertTest2 {

	public static void main(String[] args) {
		// 1. JDBC 드라이버 로드
		Scanner sc = new Scanner(System.in);
		
		// 2. 데이터베이스 서버 연결
		// Connection 객체 생성
				
		//정수형이 아니라서 null로 초기화, 자바는 지역변수 무조건 초기화해줘야
		//클래스안에 필드로 들어가있는 애들은 자동 초기화됨
		Connection con = null;
		// 사용자에게 입력 받을 부분만 '?' 표시를 한다.
		String sql = "insert into student values(?,?,?)";
		PreparedStatement pstmt = null;
		
		try {
			// 패키지 이름 + jdbc 드라이버 이름 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC load success");
			
			// 작은 따옴표 - database에서 문자열이라는 것을 알려주는 것, 큰 따옴표 - 자바에서 문자열이라는 것을 알려줌
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:DBSERVER", "test", "1234");
			System.out.println("Test2 서버연결 성공");
			
			
			// 3. Statement 객체 생성
			// preparestatement쓰면 sql문에 들어가는 값이 바뀌어도 매번 컴파일을 해주지않아도 된다.
			// statement보다 속도가 더 빠름, 내부가 안보여서 더 보안에 좋음
			pstmt = con.prepareStatement(sql);
			
			// 4. SQL문 전송
			String StudentID = "";
			String SName = "";
			String Gender = "";
			int result=0;
			
			// 물음표 번호, 칼럼이름
			
			System.out.println("input Student ID");
			StudentID = sc.nextLine();
			pstmt.setString(1, StudentID);
						
			System.out.println("input Student Name");
			SName = sc.nextLine();
			pstmt.setString(2, SName);
				
			System.out.println("input Student's gender");
			Gender = sc.nextLine();
			pstmt.setString(3, Gender);
					
			result = pstmt.executeUpdate();
			
			// 5. 결과 처리
			if(result == 0) {
				System.out.println("실패");
			}else {
				System.out.println("성공");
			}
			
			// 6. 데이터베이스 서버 연결 해제
			if(pstmt != null)
				pstmt.close();
			
			if(con != null)
				con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("JDBC load failed");
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}


}
