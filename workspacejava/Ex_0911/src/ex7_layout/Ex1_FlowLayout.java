package ex7_layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_FlowLayout {
	public static void main(String[] args) {
		
		Frame f = new Frame("하이");
		f.setBounds(500, 400, 400 , 300);

		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		Button btn6 = new Button("버튼6");
		
		f.setLayout(new FlowLayout());//프레임에 레이아웃 지정
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		f.add(btn6);

		
		f.setVisible(true);
		

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main
}
