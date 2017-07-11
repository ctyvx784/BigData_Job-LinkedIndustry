package kdata.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

	//학생 테이블 관리하는 클래
	public class StudentManager {
	
		// 학생 정보 추가
		public int insert(Student s) throws SQLException {
			//이 연결 객체를 이 기능만 쓰고 버리겠다
			Connection con = null;
			PreparedStatement pstmt = null;
			int result=0;
			try {
			//2. DB서버 연결
			con = DBUtil.getConnection();
			String sql = "insert into student values(?,?,?)";
			
			
			// 3. Statement 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, s.getStuId());
			pstmt.setString(2, s.getSName());
			pstmt.setString(3, s.getGender());
						
						
			// 4. SQL문 전송
			result = pstmt.executeUpdate();
			}finally {
				DBUtil.close(con, pstmt);	
			}
			return result;
		}
		
		// 학생 정보 출력
		public List<Student> selectAll() throws SQLException {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<Student> list = new ArrayList<>();
			
			try {
				con = DBUtil.getConnection();
				String sql = "select * from student";
				//3. Statement 객체 생성
				pstmt = con.prepareStatement(sql);
				
				// 4. SQL문 전송
				rs = pstmt.executeQuery();
			
				while(rs.next()) {
					Student s = new Student(rs.getString("stu_num"),
							rs.getString("stu_name"),
							rs.getString("stu_gender"));
					
					list.add(s);
				}
				
			}finally {
				DBUtil.close(con, pstmt, rs);
			}
			return list; 
		}
		
		//학생 이름 검색
		public Student selectByName(String name) throws SQLException {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Student s = null;			
			try {
				//DB서버 연결
				con = DBUtil.getConnection();
				String sql = "select * from student where stu_name = ?";
				//3. Statement 객체 생성
				pstmt = con.prepareStatement(sql);
				
				// SQL문 완성
				pstmt.setString(1, name);
				
				
				// 4. SQL문 전송
				rs = pstmt.executeQuery();
			
				if(rs.next()) {
					s = new Student(rs.getString("stu_num"),
					rs.getString("stu_name"),
					rs.getString("stu_gender"));
					
				}
				
			}finally {
				DBUtil.close(con, pstmt, rs);
			}
			return s; 
		}
		
		
}
