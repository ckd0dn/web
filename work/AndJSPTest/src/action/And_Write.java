dpackage action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class And_Write {
	// single-ton pattern: 
	// 객체1개만생성해서 지속적으로 서비스하자
	static And_Write single = null;

	public static And_Write getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new And_Write();
		//생성된 객체정보를 반환
		return single;
	}

	String returns = "";
	
	public String insert(String id, String pwd) {
		
		int res = 0;

		//sql임포트
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		

		String sql = "insert into test_user values (seq_tuser_idx.nextval, ?, ?)";

		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/oracle_test");
			
			//1.Connection획득
			conn = ds.getConnection();
			//2.명령처리객체 획득
			pstmt = conn.prepareStatement(sql);

			//3.pstmt parameter 채우기
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			//4.DB로 전송(res:처리된행수)
			res = pstmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			returns = String.format("{res:[{'result':'%s'}]}", "fail");
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (res ==1 ) {
			return String.format("{res:[{'result':'%s'}]}", "success");
		}
		
		System.out.println("err:" + returns);
		return returns;
		
	}
}
