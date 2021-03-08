package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.SawonVO;

public class SawonDAO {

	SqlSession sqlSession;
	public SawonDAO( SqlSession sqlSession ) {
		this.sqlSession = sqlSession;
	}
	
	//사원목록 가져오기
	public List<SawonVO> selectSawon(){
		List<SawonVO> list = sqlSession.selectList("sawon.sawon_list");
		return list;
	}
	
}


















