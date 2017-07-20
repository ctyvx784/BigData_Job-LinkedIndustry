package kdata.project.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import kdata.project.dao.BoardDAO;
import kdata.project.dto.CommentsDTO;

public class UserCommentsWriteService implements UserService {

	@SuppressWarnings("unchecked")
	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("UserCommentsWriteService");
		String id = request.getParameter("id");
		String comment = request.getParameter("comment");
		String num = request.getParameter("num");
		int result = 0;

		
		 System.out.println(id); //jsp에서 나오는 파라미터 확인
		 System.out.println(comment); System.out.println(num);
		 

		CommentsDTO comments = new CommentsDTO(id, comment, (Integer.parseInt(num)));
		try {
			result = BoardDAO.getInstance().insertComments(comments);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<CommentsDTO> list = new ArrayList<>();

		try {
			list = BoardDAO.getInstance().selectComments(Integer.parseInt(num));

			System.out.println("json---------------");
			// ArrayList와 같은 기능
			JSONArray array = new JSONArray();

			// Map과 같은 기능
			for (CommentsDTO c : list) {
				JSONObject obj = new JSONObject();
				obj.put("comment_num", c.getCommentNum());
				obj.put("id", c.getId());
				obj.put("write_date", String.valueOf(c.getWriteDate()));
				obj.put("num", c.getNumber());
				obj.put("content", c.getComment());
				array.add(obj);
			}

			System.out.println(array);
			PrintWriter out = response.getWriter();

			out.println(array);
		} catch (NumberFormatException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
