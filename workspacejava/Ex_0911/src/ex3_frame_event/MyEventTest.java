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
		// ���� x��ư Ŭ���� �����ϴ� �޼���
		System.out.println("x��ư Ŭ����!!");
		System.exit(0);//������ ����
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// �ּ�ȭ ��ư Ŭ���� ȣ��Ǵ� �޼���
		System.out.println("�ּ�ȭ ��");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// �ּ�ȭ �ܰ迡�� ���� ������� ���ƿ��� �� ȣ��Ǵ� �޼���
		System.out.println("���� ũ��� ���ƿ�!!");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	//������ ���� ��ư �̺�Ʈ�� �ݵ�� WindowListener��� �������̽��� �ʿ��ϴ�
}
