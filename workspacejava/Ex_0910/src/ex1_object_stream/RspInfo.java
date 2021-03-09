package ex1_object_stream;

import java.io.Serializable;

public class RspInfo implements Serializable{
	//이 클래스는 유저의 id와 승,무,패에 관한 기록을 관리한다
	//Object스트림을 통해 객체를 통째로 읽고 쓰기 위해서는 객체의 직렬화가 필수적이므로
	//Serializable을 구현하여 "내가 RspInfo의 정보를 일렬로 만들어 뒀습니다"라고 명시해줘야 한다.
	
	private String id;//유저의 id를 저장할 변수
	private int win, lose, draw;//승,패,무를 기록할 변수
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	
	
}
