package kdata.project.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.UserDAO;
import kdata.project.dto.UserDTO;

public class UserRegisterService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//1.요청 파라미터 처리
		//jsp에서 input의 name에 들어간 값을 가져온다.
		System.out.println("2.UserRegisterService");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String fileName = null;
		//2. DB 처리(DAO 메소드 호출)
		/*UserDAO dao = UserDAO.getInstance();
		dao.insert();*/
		UserDTO user = new UserDTO(id, pw, name, fileName);
		try {
			UserDAO.getInstance().insert(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3. DB 결과 처리
		
		//4. 이동할 다음 페이지 처리
		NextPage nextPage = new NextPage();
		int result = 0;
		//회원가입 성공
		if(result !=0){
			nextPage.setPageName("./user/login.jsp");
			nextPage.setRedriect(true);
		}
		//회원가입 실패
		else{
			
		}
		return nextPage;
	}

}
