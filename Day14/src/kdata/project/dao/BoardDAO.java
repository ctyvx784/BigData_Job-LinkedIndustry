package kdata.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kdata.project.dto.CommentsDTO;
import kdata.project.util.DBUtil;

public class BoardDAO {
	// 싱글턴 패턴--------------------------------------
	private static BoardDAO dao = new BoardDAO();

	private BoardDAO() {
	}

	public static BoardDAO getInstance() {
		return dao;
	}
	// ----------------------------------------------

	// 댓글 쓰기
	public int insertComments(CommentsDTO comment) throws SQLException {
		System.out.println("3. BoardDAO insert()");
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			//2. DB서버 연결
			con = DBUtil.getConnection();
			String sql = "insert into comments values(comments_seq.nextval,?,default,?,?)";
			
			// 3. Statement 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, comment.getId());
			pstmt.setInt(2, comment.getNumber());
			pstmt.setString(3, comment.getComment());
			
			// 4. SQL문 전송
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con, pstmt);
		}
		System.out.println("삽입확인:"+result);
		return result;

	}

	// 댓글 리스트
	public List<CommentsDTO> selectComments(int number) throws SQLException {
		System.out.println("3. BoardDAO selectComments()");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<CommentsDTO> list = new ArrayList<>();
		
		try {
			con = DBUtil.getConnection();
			String sql = "select * from comments where num=?";
			
			//3. Statement 객체 생성
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, number);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				CommentsDTO comment = new CommentsDTO(
						rs.getInt("comment_num"),
						rs.getString("id"),
						rs.getDate("write_date"),
						rs.getString("content"),
						rs.getInt("num"));
				list.add(comment);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(con, pstmt, rs);
		}
		System.out.println("리스트확인:"+list);
		return list;
	}

	// 댓글 삭제
	public void deleteComments() {

	}
}
