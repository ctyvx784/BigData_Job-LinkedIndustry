package kdata.project.dao;

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
	public void insertComments() {

	}

	// 댓글 리스트
	public void selectComments() {

	}

	// 댓글 삭제
	public void deleteComments() {

	}
}
