package ex7_layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_BorderLayout {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout( new BorderLayout());
		
		Button btn1 = new Button("����");
		Button btn2 = new Button("����");
		Button btn3 = new Button("�߾�");
		Button btn4 = new Button("����");
		Button btn5 = new Button("����");
		Button btn6 = new Button("�� ������");
		
		f.setBounds(500, 400, 400,300 );
		
		//�����ӿ� ��ư �߰�
		f.add(btn1, BorderLayout.NORTH);
		f.add(btn2, BorderLayout.SOUTH);
		f.add(btn3, BorderLayout.CENTER);
		f.add(btn4, BorderLayout.EAST);
		f.add(btn5, BorderLayout.WEST);
		
		f.add(btn6, "North");//ù���ڰ� �빮�ڸ� �̷��� ��ġ�� �����ϴ� ����� �ִ�.

		f.setVisible(true);
		

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main
	
	

	
}
