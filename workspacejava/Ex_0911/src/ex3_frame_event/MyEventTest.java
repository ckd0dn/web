package ex3_frame_event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyEventTest implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 우상단 x버튼 클릭을 감지하는 메서드
		System.out.println("x버튼 클릭됨!!");
		System.exit(0);//프레임 종료
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// 최소화 버튼 클릭시 호출되는 메서드
		System.out.println("최소화 됨");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// 최소화 단계에서 원래 사이즈로 돌아왔을 때 호출되는 메서드
		System.out.println("원래 크기로 돌아옴!!");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	//프레임 우상단 버튼 이벤트는 반드시 WindowListener라는 인터페이스가 필요하다
}
