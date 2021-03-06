package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import service.DBService;
import vo.FavoriteVO;

public class FavoriteDAO {
	
	// single-ton pattern: 
	// 객체1개만생성해서 지속적으로 서비스하자
	static FavoriteDAO single = null;

	public static FavoriteDAO getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new FavoriteDAO();
		//생성된 객체정보를 반환
		return single;
	}
	
	String returns = "";
	String res = "";
	
	//리스트받기
	public String selectList( String id ) {

		res = "";
		List<FavoriteVO> list = new ArrayList<FavoriteVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from favorites where id=?";

		try {
			//1.Connection얻어온다
			conn = DBService.getInstance().getConnection();
			
			
			//2.명령처리객체정보를 얻어오기
			pstmt = conn.prepareStatement(sql);

			//3.pstmt parameter 채우기
			pstmt.setString(1, id);
			
			//3.결과행 처리객체 얻어오기
			rs = pstmt.executeQuery();

			while (rs.next()) {
				FavoriteVO vo = new FavoriteVO();
				//현재레코드값=>Vo저장
				
				vo.setId(rs.getString("id"));
				vo.setRestaurant_name(rs.getString("RETAURANT_NAME"));
				vo.setRestaurant_number(rs.getString("RETAURANT_NUMBER"));
				System.out.println(vo.getRestaurant_name());
				
				
				res += String.format("{'id':'%s', 'restaurant_name':'%s', 'restaurant_number':'%s'}", vo.getId(),
						vo.getRestaurant_name(),vo.getRestaurant_number());			//안드로 보낼 json값
				
				System.out.println("test:" + vo.getRestaurant_name());
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
		
		
		returns = "";
		returns = String.format("{res:[%s]}",res);
		returns = returns.replaceAll("}", "},");
		
		int last = returns.length()-1;
		returns = returns.substring(0,last);
		
		returns = returns.substring(0, returns.lastIndexOf(','));
		
		returns += "]}";		
		
		return returns;
	}
}
