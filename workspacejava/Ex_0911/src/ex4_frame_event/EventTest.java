package ex4_frame_event;

import java.awt.Color;
import java.awt.Frame;

public class EventTest {
	public static void main(String[] args) {
		
		Frame f = new Frame("이벤트 연습중");
		f.setBounds(500,300,400,300);
		f.setBackground(Color.magenta);
		
		f.addWindowListener(new MyClosing());
		f.setVisible(true);
	}
}
