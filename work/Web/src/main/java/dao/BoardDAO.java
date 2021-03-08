/*
 * vopackage dao;
 * 
 * import java.util.HashMap; import java.util.List;
 * 
 * import org.apache.ibatis.session.SqlSession; import
 * org.apache.ibatis.session.SqlSessionFactory;
 * 
 * import vo.BoardVO;
 * 
 * public class BoardDAO {
 * 
 * SqlSession sqlSession; public void setSqlSession(SqlSession sqlSession) {
 * this.sqlSession = sqlSession; }
 * 
 * //전체 게시물 조회 public List<BoardVO> selectList(){
 * 
 * List<BoardVO> list = sqlSession.selectList("board.board_list"); return list;
 * }
 * 
 * //새글 추가 public int insert(BoardVO vo) { int res =
 * sqlSession.insert("board.board_insert", vo); return res; }
 * 
 * //게시물 한 건 조회 public BoardVO selectOne( int idx ) {
 * 
 * BoardVO vo = sqlSession.selectOne("board.board_one", idx); return vo;
 * 
 * }
 * 
 * //조회수 증가 public int update_readhit( int idx ) { int res =
 * sqlSession.update("board.board_update_readhit", idx); return res; }
 * 
 * //step수정 public int update_step( BoardVO baseVO ) { int res =
 * sqlSession.update("board.board_update_step", baseVO); return res; }
 * 
 * //댓글추가 public int reply(BoardVO vo) { int res =
 * sqlSession.insert("board.board_reply", vo); return res; }
 * 
 * //삭제가 가능한 글인지 조회 public BoardVO selectOne( int idx, String pwd ) {
 * 
 * BoardVO vo = null;
 * 
 * HashMap<String, Object> map = new HashMap(); map.put("idx", idx);
 * map.put("pwd", pwd); vo = sqlSession.selectOne("board.idx_pwd", map);
 * 
 * return vo;
 * 
 * }
 * 
 * //삭제(된 것 처럼)업데이트 public int del_update(BoardVO vo) { int res =
 * sqlSession.update("board.del_update", vo); return res; }
 * 
 * //페이지 별 게시물 조회 public List<BoardVO> selectList(HashMap<String, Integer> map){
 * 
 * List<BoardVO> list = sqlSession.selectList("board.board_list_condition",
 * map); return list; }
 * 
 * //전체 게시물 수 구하기 public int getRowTotal() { int count =
 * sqlSession.selectOne("board.board_count"); return count; } }
 * 
 * 
 * 
 * 
 * 
 */






























