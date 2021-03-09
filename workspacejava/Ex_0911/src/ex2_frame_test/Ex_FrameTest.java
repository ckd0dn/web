package ex2_frame_test;

import java.awt.Color;
import java.awt.Frame;

public class Ex_FrameTest {
	public static void main(String[] args) {
		
		MyFrame mf = new MyFrame();
		mf.setBackground(Color.yellow);
		
		MyFrame mf2 = new MyFrame();
		mf2.setBackground(Color.CYAN);
		mf2.setTitle("나는 프레임");
		
	}//main
}	
