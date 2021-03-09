package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import vo.MemberVO;

/**
 * Servlet implementation class MemberListAction
 */
@WebServlet("/member/member_list.do")
public class MemberListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//회원목록 가져오기
		List<MemberVO> list = MemberDAO.getInstance().selectList();
		
		//리퀘스트 영역에 list객체를 바인딩
		request.setAttribute("list", list);
		
		//위에서 바인딩 된 객체를 el표기법으로 사용할 페이지로 포워딩
		RequestDispatcher disp = 
				request.getRequestDispatcher("member_list.jsp");
		disp.forward(request, response);
	}

}










