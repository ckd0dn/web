package ex3_frame_event;

import ex2_frame_test.MyFrame;

public class EventTest {
	public static void main(String[] args) {
		
		
		MyFrame mf = new MyFrame();
		//������� frame�� ���� �̺�Ʈ �����ڸ� ���!!
		mf.addWindowListener(new MyEventTest());
		
		
		
	}//main
}
