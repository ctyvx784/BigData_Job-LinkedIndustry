package kdata.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kdata.project.dto.UserDTO;
import kdata.project.util.DBUtil;

public class UserDAO {
	// 싱글턴 패턴--------------------------------------
	private static UserDAO dao = new UserDAO();

	private UserDAO() {
	}

	public static UserDAO getInstance() {
		return dao;
	}

	// ----------------------------------------------
	// 회원 가입
	public int insert(UserDTO user) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			con = DBUtil.getConnection();
			String sql = "insert into users values(?,?,?,?,default)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPw());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getProfile());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con, pstmt);
		}
		return result;
	}

	// 회원 리스트
	public List<UserDTO> selectAll() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<UserDTO> list = new ArrayList<>();

		try {
			con = DBUtil.getConnection();
			String sql = "select * from users order by id";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				UserDTO user = new UserDTO(rs.getString("id"), rs.getString("name"), rs.getString("profile"),
						rs.getDate("ref_date"));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con, pstmt, rs);
		}

		return list;
	}

	// 회원 상세정보
	public void selectById() {

	}

	// 로그인
	public void login() {

	}

	// 회원정보삭제
	public void delete() {

	}
}
