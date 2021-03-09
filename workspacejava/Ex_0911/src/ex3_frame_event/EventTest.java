package ex3_frame_event;

import ex2_frame_test.MyFrame;

public class EventTest {
	public static void main(String[] args) {
		
		
		MyFrame mf = new MyFrame();
		//만들어진 frame에 우상단 이벤트 감지자를 등록!!
		mf.addWindowListener(new MyEventTest());
		
		
		
	}//main
}
