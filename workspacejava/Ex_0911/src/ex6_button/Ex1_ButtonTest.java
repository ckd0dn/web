package ex6_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_ButtonTest {
	public static void main(String[] args) {

		Frame f = new Frame("��ư �׽�Ʈ");
		f.setBounds(500, 400, 400, 500);

		
		//�������� �⺻������ add�ϴ� ��ü�� �ڽ��� ������ ���� ä��� �ڵ���ġ �Ӽ��� ������ �ִ�.
		//�������� �ڽ����� ���� ��ü���� ��ġ�� �ʰ� ǥ���Ϸ��� �ڵ���ġ�� �����Ѵ�.
		f.setLayout(null);//�ڵ���ġ ����
		
		
		//frame�� ��ư �߰�
		Button btnOK = new Button("�߰�");
		
		//���� �������� �ڵ���ġ�� �����ִ� ���¶��, ���ʿ� �߰��� ������Ʈ�� (button��)��
		//�ݵ�� ������Ʈ ������ ��ġ�� ������ ������ ������ �־�� �Ѵ�.
		btnOK.setSize(100,50);
		btnOK.setLocation(50, 150);
		
		Button btnClose = new Button("����");
		
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
