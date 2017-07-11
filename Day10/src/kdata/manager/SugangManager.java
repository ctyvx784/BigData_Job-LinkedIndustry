package kdata.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SugangManager {
// 수강신청 학번, 과목코드, 성적, 신청일 입력
	
	public int insertSugang(Sugang s) throws SQLException {
		//이 연결 객체를 이 기능만 쓰고 버리겠다
		Connection con = null;
		PreparedStatement pstmt = null;
		int result=0;
		try {
		//2. DB서버 연결
		con = DBUtil.getConnection();
		String sql = "insert into sign (sign_num, sign_code, sign_grade, sign_date)"
				+ "values(?,?,'0', default)";
		
		
		// 3. Statement 객체 생성
		pstmt = con.prepareStatement(sql);
		
		// 물음표 채우기
		pstmt.setString(1, s.getStuId());
		pstmt.setString(2, s.getSubCode());
					
					
		// 4. SQL문 전송
		result = pstmt.executeUpdate();
		
		
		}finally {
			DBUtil.close(con, pstmt);	
		}
		return result;
	}
// 수강신청 취소

	// 성적주기
	public int updateGrade(Sugang s) throws SQLException {
		//이 연결 객체를 이 기능만 쓰고 버리겠다
		Connection con = null;
		PreparedStatement pstmt = null;
		int result=0;
		try {
		//2. DB서버 연결
		con = DBUtil.getConnection();
		String sql = "update sign set sign_grade = ? "
				+ "where trim(sign_num) = ? and trim(sign_code) = ?";
		
		System.out.println(s);
		// 3. Statement 객체 생성
		pstmt = con.prepareStatement(sql);
		
		// 물음표 채우기
		pstmt.setInt(1, s.getGrade());
		pstmt.setString(2, s.getStuId());
		pstmt.setString(3, s.getSubCode());
		
				
		// 4. SQL문 전송
		result = pstmt.executeUpdate();
		
		
		}finally {
			DBUtil.close(con, pstmt);	
		}
		return result;
	}
	// 수강 리스트 출력
	
		public List<Sugang> selectSugang() throws SQLException {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<Sugang> list = new ArrayList<>();
			
			try {
				con = DBUtil.getConnection();
				String sql = "select student.STU_NUM, student.STU_NAME, SUBJECT.SUB_NAME, sign.SIGN_GRADE from sign"
						+ " right join student on sign.SIGN_NUM = student.stu_num"
						+ " left join SUBJECT on SUBJECT.SUB_CODE = sign.SIGN_CODE";
				
				//3. Statement 객체 생성
				pstmt = con.prepareStatement(sql);
					
					// 4. SQL문 전송
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					Sugang sg = new Sugang(rs.getString("stu_num"),
						rs.getString("stu_name"),
						rs.getString("sub_name"),
						rs.getInt("sign_grade"));
						list.add(sg);
				}
				
			}finally {
				DBUtil.close(con, pstmt, rs);
			}
			return list; 
		}
		
		// 과목별 평균 출력
		public Map<String, Integer> avgBySubject() throws SQLException{
			Map<String, Integer> map = new HashMap<>();
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				con = DBUtil.getConnection();
				String sql = "select s.sub_name, avg(grade) from sign c"
						+ " inner join subject s on"
						+ " c.sign_code = s.sub_code"
						+ " group by s.sub_name";
				//3. Statement 객체 생성
				pstmt = con.prepareStatement(sql);
				
					// 4. SQL문 전송
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					map.put(rs.getString("sub_name"), rs.getInt(2));
				}
				
			}finally {
				DBUtil.close(con, pstmt, rs);
			}
			
			return map;
			
		}
		
}
