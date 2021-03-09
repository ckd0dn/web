package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.MyBatisConnector;
import vo.ProductVO;

public class ProductDAO {
	// single-ton pattern: 
	// 객체1개만생성해서 지속적으로 서비스하자
	static ProductDAO single = null;

	public static ProductDAO getInstance() {
		//생성되지 않았으면 생성
		if (single == null)
			single = new ProductDAO();
		//생성된 객체정보를 반환
		return single;
	}
	
	SqlSessionFactory factory;
	
	public ProductDAO() {
		factory = MyBatisConnector.getInstance().getFactory();
	}
	
	//카테고리별 상품조회
	public List<ProductVO> select( String category ){
		
		List<ProductVO> list = null;
		SqlSession sqlSession = factory.openSession();
		
		list = sqlSession.selectList("pro.product_list", category);
		
		sqlSession.close();
		return list;
		
	}
	
	//상품등록
	public int insert( ProductVO vo ) {
		
		SqlSession sqlSession = factory.openSession(true);
		int cnt = sqlSession.insert("pro.product_insert", vo);
		//sqlSession.commit();
		sqlSession.close();
		
		return cnt;
	}
	
	//idx에 해당하는 상품 한 건 가져오기
	public ProductVO selectOne(int idx) {
		
		ProductVO vo = null;
		SqlSession sqlSession = factory.openSession();
		vo = sqlSession.selectOne("pro.product_one", idx);
		sqlSession.close();
		
		return vo;
	}
}











