package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import vo.MemberVO;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/login.do")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println("id2:" + id);
		System.out.println("pwd2:" + pwd);
		
		MemberVO user = MemberDAO.getInstance().selectOne(id);
		
		String param = "";
		String resultStr = "";
		
		
		System.out.println("id:" + user.getId());
		System.out.println("pwd : " + user.getPwd());
		System.out.println("name : " + user.getName());
		
		//id가 일치하지 않을 경우
		if( user == null ) {
			param = "no_id";
			resultStr = String.format("[{'param':'%s'}]", param);
			response.getWriter().print(resultStr);
			return;
		}
		
		//비밀번호가 일치하지 않는다면
		if( !user.getPwd().equals(pwd)) {
			param = "no_pwd";
			resultStr = String.format("[{'param':'%s'}]", param);
			response.getWriter().print(resultStr);
			return;
		}
		
		//유저의 정보는 세션에 저장하는 경우가 대부분
		//하지만, 세션은 서버상의 메모리를 사용하기 때문에 많은데이터, 너무 자주사용하게 되었을 때
		//브라우저를 느리게 만드는 단점이 있으므로 반드시 필요한 곳에서만 사용 할 수 있도록 하자
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		//세션 유지시간(1시간)
		//session.setMaxInactiveInterval(60 * 60);
		
		param = "clear";
		resultStr = String.format("[{'param':'%s'}]", param);
		response.getWriter().print(resultStr);
		return;
	}

}
