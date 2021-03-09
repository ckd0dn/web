package ex4_frame_event;

import java.awt.event.WindowEvent;

import ex2_frame_test.MyFrame;

public class MyClosing extends AllListener{
	
	@Override
	public void windowClosing(WindowEvent e) {
		
	
		System.out.println("종료버튼 누름!!");
		System.exit(0);
		
	}
	
}
