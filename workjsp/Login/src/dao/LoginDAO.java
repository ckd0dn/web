package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import service.DBService;
import vo.LoginVO;



public class LoginDAO {
	// single-ton pattern: 
	// 객체1개만생성해서 지속적으로 서비스하자
	static LoginDAO single = null;

	public static LoginDAO getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new LoginDAO();
		//생성된 객체정보를 반환
		return single;
	}

	String returns = "";

	public String insert(LoginVO vo) {

		int res = 0;

		//sql임포트
		Connection conn = null;
		PreparedStatement pstmt = null;



		String sql = "insert into login values (seq_login_idx.nextval, ?, ?, ?, ?, ?)";

		try {


			//1.Connection획득
			conn = DBService.getInstance().getConnection();
			//2.명령처리객체 획득
			pstmt = conn.prepareStatement(sql);

			//3.pstmt parameter 채우기
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPwd());
			pstmt.setString(4, vo.getPhone_number());
			pstmt.setString(5, vo.getEmail());
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

	public LoginVO selectOne(String id) {

		LoginVO vo = null;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from login where id=?";

		try {
			//1.Connection얻어온다
			conn = DBService.getInstance().getConnection();
			//2.명령처리객체정보를 얻어오기
			pstmt = conn.prepareStatement(sql);

			//3.pstmt parameter 설정
			pstmt.setString(1, id);

			//4.결과행 처리객체 얻어오기
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo = new LoginVO();
				//현재레코드값=>Vo저장
				vo.setIdx(rs.getInt("idx"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPwd(rs.getString("pwd"));
				vo.setPhone_number(rs.getString("phone_number"));
				vo.setEmail(rs.getString("email"));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return vo;
	}

	public String update(LoginVO vo) {

		int res = 0;

		//sql임포트
		Connection conn = null;
		PreparedStatement pstmt = null;



		String sql = "update login set name=?, id=?, pwd=?, phone_number=?, email=? where idx=?";

		System.out.println(vo.getId());
		System.out.println(vo.getIdx());

		try {


			//1.Connection획득
			conn = DBService.getInstance().getConnection();
			//2.명령처리객체 획득
			pstmt = conn.prepareStatement(sql);

			//3.pstmt parameter 채우기
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPwd());
			pstmt.setString(4, vo.getPhone_number());
			pstmt.setString(5, vo.getEmail());
			pstmt.setInt(6, vo.getIdx());
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

		return returns;

	}

}
