package ex6_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex3_ExitEvent {

	public Ex3_ExitEvent() {

		Frame f = new Frame();

		f.setBounds(850, 300, 500, 250);
		f.setLayout(null);//자동배치 해제

		Button btn1 = new Button("리얼종료");
		btn1.setBounds(100, 100, 100, 50);
		f.add(btn1);
		
		Button btn2 = new Button("종료안할래요");
		btn2.setBounds(300, 100, 100, 50);
		f.add(btn2);

		//버튼에게 이벤트 감지자 등록
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("종료합니다.");
				System.exit(0);//현재 열려있는 모든 프레임을 종료
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//현재 프레임만 종료하고 싶을 경우
				f.dispose();
			}
		});

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

		
		f.setVisible(true);
	}//생성자
}
