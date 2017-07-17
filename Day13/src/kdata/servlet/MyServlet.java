package kdata.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//이처럼 url을 가짜로 만들어줘야 접근 가능, 이게 아니면 web.xml에 써야댐
//이 url로 들어오면 servlet접근할 수 있음
@WebServlet("/test.lny")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
        
        System.out.println("MyServlet()");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy()");
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service()");
		
	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// console에 찍히는 것
		
		//PrintWriter out = response.getWriter();
		// 브라우저에 찍히는 것
		//out.print("My Servlet");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println("doGet()");
		
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		out.println(num);
		out.println(name);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF=8");
		doGet(request, response);
		//response.setContentType("text/html; charset=UTF-8");
		System.out.println(request.getParameter("#name"));
	}

}
