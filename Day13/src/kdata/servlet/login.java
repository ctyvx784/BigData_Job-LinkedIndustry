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

@WebServlet("/login")
public class login extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public login(){
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
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		out.print("성공?");
		
		if(id.equals("test") && pw.equals("1234")){
			session.setAttribute("id", id);
			session.setAttribute("name", "강영선");
			response.sendRedirect("main");
		}
			
		else{
			response.sendRedirect("login.html");
		}	
	}

}
