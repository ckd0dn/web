package dao;

import org.apache.ibatis.session.SqlSession;

import vo.EmpVO;

public class LoginDAO {

	SqlSession sqlSession; 

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession; 
	}

	// id를 통한 로그인 정보 확인
	public EmpVO login_one(String id) {
		EmpVO vo = sqlSession.selectOne("login.login_one", id);
		return vo;
	}
	
	// 아이디를 찾는 메서드
	public EmpVO find_id(EmpVO vo) {
		EmpVO Basevo = sqlSession.selectOne("login.find_id", vo);
		return Basevo;
	}


}
