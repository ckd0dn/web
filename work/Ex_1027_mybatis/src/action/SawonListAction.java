package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SawonDAO;
import vo.SawonVO;

/**
 * Servlet implementation class SawonListAction
 */
@WebServlet("/sawon/sawonlist.do")
public class SawonListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int deptno = 0;
		String str_deptno = request.getParameter("deptno");
		
		if( str_deptno != null && !str_deptno.isEmpty()) {
			deptno = Integer.parseInt(str_deptno);
			
		}
		
		//사원목록 가져오기
		List<SawonVO> list=null;
		
		
		if (deptno == 0 ) {
			//전체조회
			list = SawonDAO.getInstance().select();
		}else {
			//부서별 조회
			list = SawonDAO.getInstance().select(deptno);
		}
		 
		
		System.out.println(list.size());
		
		request.setAttribute("list", list);
		
		RequestDispatcher disp =
				request.getRequestDispatcher("sawon_list.jsp");
		disp.forward(request, response);
	}

}
