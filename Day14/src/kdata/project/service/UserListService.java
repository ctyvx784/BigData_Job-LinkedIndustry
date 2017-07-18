package kdata.project.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.UserDAO;
import kdata.project.dto.UserDTO;

public class UserListService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		// jsp에서 input의 name에 들어간 값을 가져온다.
		System.out.println("2.UserRegisterService");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String profile = request.getParameter("profile");
		String refdate = request.getParameter("refDate");

		List<UserDTO> list = null;
		// 2. DB 처리(DAO 메소드 호출)
		/*
		 * UserDAO dao = UserDAO.getInstance(); dao.insert();
		 */
		UserDTO user = new UserDTO(id, name, profile, refdate);
		try {
			list = UserDAO.getInstance().selectAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3. DB 결과 처리
		request.setAttribute("list", list);
		System.out.println(list.size());
		// 4. 이동할 다음 페이지 처리
		NextPage nextPage = new NextPage();

		nextPage.setPageName("./user/list.jsp");
		nextPage.setRedriect(false);
		return nextPage;
	}

}
