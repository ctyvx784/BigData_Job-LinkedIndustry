package kdata.project.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.dao.BoardDAO;

public class UserCommentsDeleteService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UserCommentsDeleteService");
		String commentNum = request.getParameter("comment_num");
		int result=0;
		
		try {
			result=BoardDAO.getInstance().deleteComments(Integer.parseInt(commentNum));
		} catch (NumberFormatException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result !=0)
			System.out.println("삭제성공");
		return null;
	}

}

