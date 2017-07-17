package kdata.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login.serv")
public class LoginServelet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public LoginServelet(){
		super();		
	}
	
	public void init(ServletConfig config) throws ServletException{
		
	}
	
	public void destroy(){
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		HttpSession session = request.getSession();
		
		if(id.equals("test") && pw.equals("1234")){
			session.setAttribute("id", id);
			session.setAttribute("name", "강영선");
			response.sendRedirect("main.serv");
		}
			
		else{
			response.sendRedirect("login.html");
		}
			
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF=8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		HttpSession session = request.getSession();
		
		if(id.equals("test") && pw.equals("1234")){
			session.setAttribute("id", id);
			session.setAttribute("name", "강영선");
			response.sendRedirect("main.serv");
		}
			
		else{
			response.sendRedirect("login.html");
		}
			
		
	}

}
