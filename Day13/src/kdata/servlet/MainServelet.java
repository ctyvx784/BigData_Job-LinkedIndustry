package kdata.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/main")
public class MainServelet {

	private static final long serialVersionUID = 1L;

	public MainServelet(){
		super();		
	}
	
	public void init(ServletConfig config) throws ServletException{
		
	}
	
	public void destroy(){
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF=8");
		
	HttpSession session = request.getSession();
		
		String id = (String) session.getAttribute("id");
		String name = (String) session.getAttribute("name");
		
		PrintWriter out = response.getWriter();
		if(id == null || name == null)
			response.sendRedirect("login.html");
		else{
			out.print("("+id+")님 환영합니다.<br>");
			out.print("("+name+")님 환영합니다.");
			out.print("<a href='logout'>로그아웃</a>");
		}
		
	}
}
