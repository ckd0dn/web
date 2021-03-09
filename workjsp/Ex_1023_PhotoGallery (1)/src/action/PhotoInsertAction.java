package action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.PhotoDAO;
import vo.PhotoVO;

/**
 * Servlet implementation class PhotoInsertAction
 */
@WebServlet("/photo/insert.do")
public class PhotoInsertAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String web_path = "/upload/";
		
		//현재 프로젝트를 관리하는 객체
		ServletContext application = request.getServletContext();
		
		//상대경로(upload)를 절대경로(upload)로 변환
		String path = application.getRealPath(web_path);
		System.out.println(path);
		
		int max_size = 1024 * 1024 * 100;//최대업로드 용량(100mb)
		
		//파일을 포함하고 있는 request 정보를 업로드 처리하기 위한 객체
		MultipartRequest mr = new MultipartRequest( 
								request,
								path,
								max_size,
								"utf-8",
								new DefaultFileRenamePolicy());
		
		String filename = "no_file";
		
		//업로드된 파일의 정보를 획득
		File f = mr.getFile("photo");
		
		if( f != null) {
			//파일이 업로드 되었다면 업로드된 파일명을 가져온다.
			filename = f.getName();
		}
		
		//파일이외의 일반적인 파라미터를 수신하자!
		String title = mr.getParameter("title");
		String pwd = mr.getParameter("pwd");
		String ip = request.getRemoteAddr();
		
		PhotoVO vo = new PhotoVO();
		vo.setTitle(title);
		vo.setFilename(filename);
		vo.setPwd(pwd);
		vo.setIp(ip);
		
		PhotoDAO.getInstance().insert(vo);
		
		response.sendRedirect("list.do");
	}

}
