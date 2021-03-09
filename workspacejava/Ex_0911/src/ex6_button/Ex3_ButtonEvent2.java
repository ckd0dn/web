package ex6_button;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex3_ButtonEvent2 {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(600, 200, 1000, 500);
		f.setLayout(new FlowLayout());

		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("종료");

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

		//이벤트 감지자 생성
		ActionListener act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//e객체는 사용자가 클릭한 버튼의 정보를 가지고 있다.
				//e.getActionCommand() : 클릭한 버튼에 부착되어 있는 제목
				//System.out.println(e.getActionCommand());

				switch (e.getActionCommand()) {
				case "버튼1" :
					System.out.println("버튼1번 클릭됨");
					break;
				case "버튼2" :
					System.out.println("버튼2번 클릭됨");
					break;
				case "버튼3" :
					System.out.println("버튼3번 클릭됨");
					break;
				case "종료" :
					System.out.println("종료");
					Ex3_ExitEvent ee = new Ex3_ExitEvent();
					break;
				}
				
			}//switch
		};

		//각 버튼에 이벤트 감지자 등록
		btn1.addActionListener(act);
		btn2.addActionListener(act);
		btn3.addActionListener(act);
		btn4.addActionListener(act);


		f.setVisible(true);


		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});


	}
}
