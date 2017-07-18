package kdata.project.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.UserDAO;
import kdata.project.dto.UserDTO;

public class UserDetailService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("2.UserDetailService");
		String id = request.getParameter("id");

		UserDTO user = null;
		try {
			user = UserDAO.getInstance().selectById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user.toString();
		request.setAttribute("user", user);

		NextPage nextPage = new NextPage();

		nextPage.setPageName("./user/detail.jsp");
		nextPage.setRedriect(false);
		return nextPage;
	}

}
