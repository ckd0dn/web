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
		f.setLayout(null);//�ڵ���ġ ����

		Button btn1 = new Button("��������");
		btn1.setBounds(100, 100, 100, 50);
		f.add(btn1);
		
		Button btn2 = new Button("������ҷ���");
		btn2.setBounds(300, 100, 100, 50);
		f.add(btn2);

		//��ư���� �̺�Ʈ ������ ���
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�����մϴ�.");
				System.exit(0);//���� �����ִ� ��� �������� ����
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//���� �����Ӹ� �����ϰ� ���� ���
				f.dispose();
			}
		});

		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

		
		f.setVisible(true);
	}//������
}
