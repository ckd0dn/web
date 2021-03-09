package ex5_frame_adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventTest {
	public static void main(String[] args) {
		
		Frame f = new Frame("어댑터를 사용한 이벤트 처리!");
		f.setBounds(400, 400, 400, 400);
		
		//windowAdapter를 사용한 우상단 이벤트 처리
		f.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
	}//main
}
