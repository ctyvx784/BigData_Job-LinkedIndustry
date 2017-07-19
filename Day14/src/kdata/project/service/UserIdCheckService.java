package kdata.project.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.UserDAO;

public class UserIdCheckService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int result = 0;
		System.out.println("UserIdCheckService excute");
		String id = request.getParameter("id");
		System.out.println(id); //아이디가 잘 들어오는지 확인
		PrintWriter out = null;
		
		try {
			result = UserDAO.getInstance().idCheck(id);
			//System.out.println(result);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print(result);
		return null;
	}

}
