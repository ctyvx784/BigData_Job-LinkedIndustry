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
}
