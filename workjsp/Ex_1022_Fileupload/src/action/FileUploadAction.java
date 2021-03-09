package action;

import java.io.File;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class FileUploadAction
 */
@WebServlet("/upload.do")
public class FileUploadAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.setCharacterEncoding("utf-8");
		//String path = "c:/upload";
		String web_path = "/upload/";
		
		//현재 웹애플리케이션을 관리하는 객체
		ServletContext application = request.getServletContext();
		
		//프로젝트상의 상대경로 -> 절대경로로 변환
		String path = application.getRealPath(web_path);
		
		System.out.println( "경로 : " + path );
		
		int max_size = 1024 * 1024 * 100;//최대 업로드 용량(100mb)
	
		//파일을 포함하고 있는 데이터를 수신하고 처리하기 위한 클래스
		MultipartRequest mr = new MultipartRequest( 
						request,  
						path,//업로드 위치 
						max_size,//최대 업로드 용량 
						"utf-8", //인코딩 타입
						new DefaultFileRenamePolicy());//동일파일명 정책
		
		//업로드 된 파일정보 얻어오기
		String filename = "no_file";
		File f = mr.getFile("photo");//c:/upload/파일명.jpg
		
		if( f != null ) {
			//파일이 정상적으로 업로드 되었다면...
			filename = f.getName();//업로드 된 파일명!!
			//System.out.println(filename);
		}
		
		//파일 이외의 일반 파라미터 또한 mr를 통해 수신
		//request.getParameter("title");  <-- 이렇게 받으면 절대 안됨!!
		String title = mr.getParameter("title");
		
		//request영역에 필요한 정보를 바인딩
		request.setAttribute("title", title);
		request.setAttribute("filename", filename);
		
		//위에서 바인딩 해놓은 정보를 사용할 페이지로 포워딩
		RequestDispatcher disp = 
				request.getRequestDispatcher("result.jsp");
		disp.forward(request, response);
		
	}

}













