package kdata.project.service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import kdata.project.dao.UserDAO;
import kdata.project.dto.UserDTO;

public class UserRegisterService implements UserService {

	@Override
	public NextPage execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("2.UserRegisterService");
		
		String path = request.getServletContext().getRealPath("profile");
		System.out.println(path);
		int result=0;
		MultipartRequest multi = null;
		//최대크기 10mb
		
		try {
			multi = new MultipartRequest(
					request,path,1024*1024*10, "UTF-8",
					new DefaultFileRenamePolicy());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String id = multi.getParameter("id");
		String pw = multi.getParameter("pw");
		String name = multi.getParameter("name");
		String fileSystemName = multi.getFilesystemName("file");
		
		System.out.println("파일시스템" + fileSystemName);
		
		UserDTO user = new UserDTO(id,pw,name,fileSystemName);
		System.out.println("user 생성완료");
		
		try {
			result = UserDAO.getInstance().insert(user);
			System.out.println("insert 결과" + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*//1.요청 파라미터 처리
		//jsp에서 input의 name에 들어간 값을 가져온다.
		System.out.println("2.UserRegisterService");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String profile = request.getParameter("profile");
		
		System.out.println(id);
		int result = 0;
		//2. DB 처리(DAO 메소드 호출)
		UserDAO dao = UserDAO.getInstance();
		dao.insert();
		UserDTO user = new UserDTO(id, pw, name, profile);
		try {
			result = UserDAO.getInstance().insert(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3. DB 결과 처리
		
		//4. 이동할 다음 페이지 처리
		NextPage nextPage = new NextPage();
		//회원가입 성공
		if(result !=0){
			nextPage.setPageName("./user/login.jsp");
			nextPage.setRedriect(true);
		}
		//회원가입 실패
		else{
			request.setAttribute("errorMsg", "회원가입에 실패했습니다.");
			nextPage.setPageName("./errors/error.jsp");
			nextPage.setRedriect(false);
		}
		return nextPage;*/
		//이동할 다음 페이지 처리
		NextPage nextPage = new NextPage();
        //회원가입 실패
     if(result == 0) {
        //request영역에 메세지 담아서 보냄
        request.setAttribute("errorMsg", "회원가입에 실패했습니다");
        nextPage.setPageName("./errors/error.jsp");
        
        // request영역은 redirect로 보내면 유지가 안됨
        nextPage.setRedriect(false);
     }else {
        //회원가입 성공
        System.out.println("성공");
        
        nextPage.setPageName("./user/login.jsp");
        // redirect방식은 주소가 바뀜, request유지 안함
        nextPage.setRedriect(true);
     }
		return null;
	}

}
