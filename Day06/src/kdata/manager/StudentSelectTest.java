package kdata.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentSelectTest {

	public static void main(String[] args) {
		// 1. JDBC 드라이버 로드
		Scanner sc = new Scanner(System.in);
		Connection con	= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			// 패키지 이름 + jdbc 드라이버 이름 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC load success");
			
			// 2. 데이터베이스 서버 연결
			// Connection 객체 생성
					
			//정수형이 아니라서 null로 초기화, 자바는 지역변수 무조건 초기화해줘야
			//클래스안에 필드로 들어가있는 애들은 자동 초기화됨
			// 사용자에게 입력 받을 부분만 '?' 표시를 한다.
			// 작은 따옴표 - database에서 문자열이라는 것을 알려주는 것, 큰 따옴표 - 자바에서 문자열이라는 것을 알려줌
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:DBSERVER", "test", "1234");
			System.out.println("Test2 서버연결 성공");
			
			
			// 3. Statement 객체 생성
			// preparestatement쓰면 sql문에 들어가는 값이 바뀌어도 매번 컴파일을 해주지않아도 된다.
			// statement보다 속도가 더 빠름, 내부가 안보여서 더 보안에 좋음
			String sql = "select * from student";
			pstmt = con.prepareStatement(sql);
			
			
			// 4. SQL문 전송
			rs = pstmt.executeQuery();
			
			// 5. 결과 처리
			//처음에 0번째 행을 가리키고 있다가 다음행으로 커서를 움직이는 함수
			while(rs.next()) {
				System.out.println(rs.getString("stu_num")
						+ " " + rs.getString("stu_name") + "\t" + rs.getString("stu_gender"));
				
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("JDBC load failed");
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			// 6. 데이터베이스 서버 연결 해제
			// 연 순서의 반대로 닫아야한다.
		
				try {	
					
					if(rs != null) 
						rs.close();
					if(pstmt != null)
						pstmt.close();
					
					if(con != null)
						con.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
		sc.close();
	}


}