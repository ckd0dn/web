package ex6_button;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex2_ButtonEvent {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(600, 200, 1000, 500);
		f.setLayout(new FlowLayout());

		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");

		//부모인 Frame이 FlowLayout으로 설정되어 있다면
		//자식이 되는 컴포넌트들은 btn1.setSize()...등으로 
		btn1.setPreferredSize(new Dimension(150, 100));
		btn2.setPreferredSize(new Dimension(150, 100));
		btn3.setPreferredSize(new Dimension(150, 100));
		btn4.setPreferredSize(new Dimension(150, 100));

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);

		//만들어진 버튼에 이벤트 감지자 등록
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// btn1 클릭시 하고자 하는 코드를 수행
				System.out.println("1번 버튼 눌렀음");

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i <5; i++) {
					
					
				System.out.println("2번 버튼");
			
				}

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("3번 버튼");

			}
		});

		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("4번 버튼");

			}
		});
		f.setVisible(true);


		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


	}
}
