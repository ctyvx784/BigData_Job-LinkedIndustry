package kdata.project.dao;

public class UserDAO {
	//싱글턴 패턴--------------------------------------
	private static UserDAO dao = new UserDAO();
	private UserDAO(){}
	
	public static UserDAO getInstance(){
		return dao;
	}
	//----------------------------------------------
	// 회원 가입
	public void insert(){
		System.out.println("3.UserDAO insert()");
	}
	//회원 리스트
	public void selectAll(){
		
	}
	//회원 상세정보
	public void selectById(){
		
	}
	//로그인
	public void login(){
		
	}
	//회원정보삭제
	public void delete(){
		
	}
}
