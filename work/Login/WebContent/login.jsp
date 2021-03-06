<%@page import="java.util.List"%>
<%@page import="vo.LoginVO"%>
<%@page import="dao.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
//로그인용!!


	request.setCharacterEncoding("UTF-8");

	//안드로이드에서 넘겨준 파라미터를 받는다
	
	String type = request.getParameter("type");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	
	String result = "";
	String resultStr = "";
	
	if (type == null) {
		return;
	} else if (type.equals("type_regi")) {
		LoginDAO dao = LoginDAO.getInstance();
		LoginVO vo = new LoginVO();
		
		//로그인한 id의 vo를 가져옴
		vo = dao.selectOne(id);
	

		
		// id가 없는 경우
		if (vo == null) {
			result = "no_id";
			resultStr = String.format("{res:[{'result':'%s'}]}", result);
			
			out.print(resultStr);
			return;
		}
	
		// 비밀번호가 다를시
		if (!vo.getPwd().equalsIgnoreCase(pwd)) {
			result = "no_pwd";
			resultStr = String.format("{res:[{'result':'%s'}]}", result);
			
			out.print(resultStr);
			return;
		}
	
		vo = LoginDAO.getInstance().selectOne(id);
		
		result = "success";
		resultStr = String.format("{res:[{'result':'%s','id':'%s','name':'%s','pwd':'%s','phone_number':'%s','email':'%s','idx':'%d'}]}",
												result, vo.getId(), vo.getName(), vo.getPwd(), vo.getPhone_number(), vo.getEmail(), vo.getIdx());
		
		
		out.print(resultStr);//성공 실패 여부를 안드로이드로 재 전송
		
		
	}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>