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
		
		Button btn1 = new Button("북쪽");
		Button btn2 = new Button("남쪽");
		Button btn3 = new Button("중앙");
		Button btn4 = new Button("동쪽");
		Button btn5 = new Button("서쪽");
		Button btn6 = new Button("난 땅부자");
		
		f.setBounds(500, 400, 400,300 );
		
		//프레임에 버튼 추가
		f.add(btn1, BorderLayout.NORTH);
		f.add(btn2, BorderLayout.SOUTH);
		f.add(btn3, BorderLayout.CENTER);
		f.add(btn4, BorderLayout.EAST);
		f.add(btn5, BorderLayout.WEST);
		
		f.add(btn6, "North");//첫글자가 대문자면 이렇게 위치를 선정하는 방법도 있다.

		f.setVisible(true);
		

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main
	
	

	
}
