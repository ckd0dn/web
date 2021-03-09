package ex1_frame_test;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_FrameTest {
	

	public static void main(String[] args) {
		
		Frame frame = new Frame("첫 프레임");
		frame.setSize(400, 300);
		frame.setLocation(500,200);
		
		frame.setBackground(Color.blue);
		
		//visible속성을 true로 주면 frame이 화면에 노출
		frame.setVisible( true );
	}//main
}
