package action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import vo.MemberVO;

/**
 * Servlet implementation class MemberCheckIdAction
 */
@WebServlet("/member/check_id.do")
public class MemberCheckIdAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		//check_id.do?id=aa
		String id = request.getParameter("id");
		
		//DB에서 id변수에 해당되는 값을 가진 사람이 있는지 검색
		MemberVO vo = MemberDAO.getInstance().selectOne(id);
		
		String res = "no";
		
		if( vo == null ) {
			//회원가입이 가능한 경우
			res = "yes";
		}
		
		//json을 통해 결과값을 콜백메서드로 전송
		//json타입으로 결과를 전송하면 한글이 포함되어 있는 경우 값이 깨지기 때문에
		//응답객체를 통해 한글텍스트를 전송 가능하도록 해 줘야 한다.
		response.setContentType("text/plain;charset=UTF-8");
		String resultStr = String.format(
				"[{'result':'%s'}, {'id':'%s'}]", res, id);
		
		//콜백메서드로 resultStr을 응답
		response.getWriter().println(resultStr);
	}

}
















