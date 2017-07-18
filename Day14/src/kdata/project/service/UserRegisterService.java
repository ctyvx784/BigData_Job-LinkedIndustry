package kdata.project.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.UserDAO;

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
		//2. DB 처리(DAO 메소드 호출)
		/*UserDAO dao = UserDAO.getInstance();
		dao.insert();*/
		UserDAO.getInstance().insert();
		//3. DB 결과 처리
		
		//4. 이동할 다음 페이지 처리
		return null;
	}

}
