package ex1_frame_test;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_FrameTest {
	

	public static void main(String[] args) {
		
		Frame frame = new Frame("ù ������");
		frame.setSize(400, 300);
		frame.setLocation(500,200);
		
		frame.setBackground(Color.blue);
		
		//visible�Ӽ��� true�� �ָ� frame�� ȭ�鿡 ����
		frame.setVisible( true );
	}//main
}
