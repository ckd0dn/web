package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GogekDAO;
import dao.SawonDAO;
import vo.GogekVO;

/**
 * Servlet implementation class GogekListAction
 */
@WebServlet("/sawon/gogeklist.do")
public class GogekListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String search = "all";
		String str_goaddr = request.getParameter("search");
		
		//정상적으로 값이 들어온 경우
		if( str_goaddr != null && !str_goaddr.isEmpty()) {
			search = str_goaddr;
			
		}
		
		
		
		List<GogekVO> list = null;
		
		if (search.equals("all") ) {
			//전체조회
			list = GogekDAO.getInstance().select();
		}else {
			//부서별 조회
			list = GogekDAO.getInstance().select(search);
		}
		
		
		request.setAttribute("list", list);
		
		RequestDispatcher disp =
				request.getRequestDispatcher("gogek_list.jsp");
		disp.forward(request, response);
	}

}
