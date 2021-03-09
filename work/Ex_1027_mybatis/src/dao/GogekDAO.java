package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.GogekVO;
import vo.SawonVO;

public class GogekDAO {
	// single-ton pattern: 
	// 객체1개만생성해서 지속적으로 서비스하자
	static GogekDAO single = null;

	public static GogekDAO getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new GogekDAO();
		//생성된 객체정보를 반환
		return single;
	}
	
	SqlSessionFactory factory;
	
	public GogekDAO() {
		factory = MyBatisConnector.getInstance().getFactory();
	}
	
	//사원목록 가져오기
	public List<GogekVO> select(){
		List<GogekVO> list = null;
		
		SqlSession sqlSession = factory.openSession();
		//myBatis를 통한 sql처리 객체인 sqlSession을 통해 작업을 수행
		list = sqlSession.selectList("gogek.gogek_list");
		
		//connection, pstmt, resultSet등의 객체를 닫아주는 작업
		sqlSession.close();
		return list;
	}
	
	//지역별 고객목록 조회
	public List<GogekVO> select( String goaddr ){
		List<GogekVO> list = null;
		
		SqlSession sqlSession = factory.openSession();
		
		list = sqlSession.selectList("gogek.gogek_select", goaddr);
		
		sqlSession.close();
		return list;
	}
}
