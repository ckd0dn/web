package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.SawonVO;

public class SawonDAO {
	// single-ton pattern: 
	// 객체1개만생성해서 지속적으로 서비스하자
	static SawonDAO single = null;

	public static SawonDAO getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new SawonDAO();
		//생성된 객체정보를 반환
		return single;
	}
	
	SqlSessionFactory factory;
	
	public SawonDAO() {
		factory = MyBatisConnector.getInstance().getFactory();
	}
	
	//사원목록 가져오기
	public List<SawonVO> select(){
		List<SawonVO> list = null;
		
		SqlSession sqlSession = factory.openSession();
		//myBatis를 통한 sql처리 객체인 sqlSession을 통해 작업을 수행
		list = sqlSession.selectList("sawon.sawon_list");
		
		//connection, pstmt, resultSet등의 객체를 닫아주는 작업
		sqlSession.close();
		return list;
	}
	
	//부서별 사원목록 가져오기
		public List<SawonVO> select( int no ){
			List<SawonVO> list = null;
			
			SqlSession sqlSession = factory.openSession();
			//myBatis를 통한 sql처리 객체인 sqlSession을 통해 작업을 수행
			list = sqlSession.selectList("sawon.sawon_list_no", no);
			
			//connection, pstmt, resultSet등의 객체를 닫아주는 작업
			sqlSession.close();
			return list;
		}
}
