package ex6_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_ButtonTest {
	public static void main(String[] args) {

		Frame f = new Frame("버튼 테스트");
		f.setBounds(500, 400, 400, 500);

		
		//프레임은 기본적으로 add하는 객체를 자신의 영역에 가득 채우는 자동배치 속성을 가지고 있다.
		//프레임이 자식으로 가질 객체들을 겹치지 않게 표현하려면 자동배치를 꺼야한다.
		f.setLayout(null);//자동배치 끄기
		
		
		//frame에 버튼 추가
		Button btnOK = new Button("추가");
		
		//현재 프레임이 자동배치가 꺼져있는 상태라면, 안쪽에 추가될 컴포넌트들 (button등)은
		//반드시 컴포넌트 고유의 위치와 사이즈 정보를 가지고 있어야 한다.
		btnOK.setSize(100,50);
		btnOK.setLocation(50, 150);
		
		Button btnClose = new Button("종료");
		
		btnClose.setSize(100,50);
		btnClose.setLocation(250, 150);
		f.add(btnOK);
		f.add(btnClose);
		
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}//main
}
