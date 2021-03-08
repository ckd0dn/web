package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.Commute_viewVO;
import vo.EmpVO;

public class EmpDAO {

	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	// 사원 목록 검색
	public List<EmpVO> selectList(){
		List<EmpVO> emp_list = sqlSession.selectList("emp.emp_list");
		return emp_list;
	}

	// id중복확인을 위한 한명 검색
	public EmpVO emp_one_id(String id) {
		EmpVO vo = sqlSession.selectOne("emp.emp_one_id", id);

		return vo;
	}

	// 회원 등록
	public int emp_insert(EmpVO vo) {
		int res = sqlSession.insert("emp.emp_insert", vo);
		return res;
	}

	// 상세보기 페이지에서 회원정보를 불러오기위한 emp_idx select one
	public EmpVO emp_one_idx(int emp_idx) {
		EmpVO vo = sqlSession.selectOne("emp.emp_one_idx", emp_idx);
		return vo;
	}

	// 직원 삭제
	public int emp_del(int emp_idx) {
		int res = sqlSession.delete("emp.emp_del", emp_idx);
		return res;
	}

	// 직원 정보 수정
	public int emp_update(EmpVO vo) {
		int res = sqlSession.update("emp.emp_update", vo);
		return res;
	}

	// 페이지대로 항목 조회
	public List<EmpVO> selectList(HashMap<String, Integer> map){
		List<EmpVO> emp_list = sqlSession.selectList("emp_list_condition", map);
		return emp_list;
	}

	// 전체 항목 수 구하기
	public int getRowTotal() {
		int count = sqlSession.selectOne("emp.emp_count");
		return count;
	}

	// 두 값이 전부 있는 경우의 전체 항목 수 구하기
	public int getRowTotal_both_notnull(HashMap<String, Object> map) {
		int count = sqlSession.selectOne("emp.emp_count_both_notnull", map); 
		return count;
	}

	// 검색시 부서명 사원명 둘다 있는 경우
	public List<EmpVO> both_notnull(HashMap<String, Object> map){
		List<EmpVO> emp_list = sqlSession.selectList("emp.both_notnull", map);
		return emp_list;
	}
	
	// 부서명만 있는 경우의 전체 항목 수 구하기
	public int getRowTotal_deptname_nn(String dept_name) {
		int count = sqlSession.selectOne("emp.emp_count_deptname_nn",dept_name);
		return count;
	}
	
	// 검색시 부서명만 있는 경우
	public List<EmpVO> dept_name_notnull(HashMap<String, Object> map){
		List<EmpVO> emp_list = sqlSession.selectList("emp.emp_name_null", map);
		return emp_list;
	}
	
	// 직원명만 있는 경우의 전체 항목 수 구하기
	public int getRowTotal_empname_nn(String emp_name) {
		int count = sqlSession.selectOne("emp.emp_count_empname_nn", emp_name);
		return count;
	}
	
	// 검색시 사원명만 있는 경우
	public List<EmpVO> emp_name_notnull(HashMap<String, Object> map){
		List<EmpVO> emp_list = sqlSession.selectList("emp.dept_name_null", map);
		return emp_list;
	}
	
	
}
