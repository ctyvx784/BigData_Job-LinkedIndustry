package kdata.project.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {
	//UserServlet에서 들어오는 요청에 대한 메소드 생성, doGet으로 받는 변수를 받는다.
	public abstract NextPage execute(HttpServletRequest request, HttpServletResponse response);
}
