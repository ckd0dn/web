package ex2_frame_test;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame{
	
	public MyFrame() {
		
		//setSize(400,400);//ũ��
		//setLocation(800, 300);//��ġ
		setBounds(400,400,800, 300);
		
		
		setBackground(Color.orange);
		
		setVisible( true );
	}
}
