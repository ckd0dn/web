package ex5_frame_adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventTest {
	public static void main(String[] args) {
		
		Frame f = new Frame("����͸� ����� �̺�Ʈ ó��!");
		f.setBounds(400, 400, 400, 400);
		
		//windowAdapter�� ����� ���� �̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setVisible(true);
	}//main
}
