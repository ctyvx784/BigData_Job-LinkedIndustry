package kdata.project.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.service.NextPage;
import kdata.project.service.UserRegisterService;
import kdata.project.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("*.kdata")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. URL 별 분기------------------------------------------------
		System.out.println("User Servlet");
		
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		//path.length();
		String cmd = uri.substring(path.length() + 1);
		
		//System.out.println(uri);
		//System.out.println(path);
		System.out.println(cmd);
		
		UserService service = null;
		NextPage nextPage = null;
		//회원가입
		if(cmd.equals("register.kdata")){
			System.out.println("회원가입");
			service = new UserRegisterService();
			nextPage = service.execute(request, response);
		}
		//회원정보조회
		else if(cmd.equals("list.kdata")){
			System.out.println("회원정보조회");
		}
		//회원정보상세조회
		else if(cmd.equals("detail.kdata")){
			System.out.println("회원상제페이지");
		}
		//회원정보삭제
		else if(cmd.equals("delete.kdata")){
			System.out.println("회원정보삭제");
		}
		//회원 로그인
		else if(cmd.equals("login.kdata")){
			System.out.println("로그인페이지");
		}
		//회원 로그아웃
		else if(cmd.equals("logout.kdata")){
			System.out.println("로그아웃페이지");
		}
		
		//2. 다음 페이지 이동-------------------------------
		if(nextPage == null){
			System.out.println("반환값 확인");
		}else{
			if(nextPage.isRedriect()){
				response.sendRedirect(nextPage.getPageName());
			}
			else{
				request.getRequestDispatcher(nextPage.getPageName()).forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
