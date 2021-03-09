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

		Button btn1 = new Button("��ư1");
		Button btn2 = new Button("��ư2");
		Button btn3 = new Button("��ư3");
		Button btn4 = new Button("��ư4");

		//�θ��� Frame�� FlowLayout���� �����Ǿ� �ִٸ�
		//�ڽ��� �Ǵ� ������Ʈ���� btn1.setSize()...������ 
		btn1.setPreferredSize(new Dimension(150, 100));
		btn2.setPreferredSize(new Dimension(150, 100));
		btn3.setPreferredSize(new Dimension(150, 100));
		btn4.setPreferredSize(new Dimension(150, 100));

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);

		//������� ��ư�� �̺�Ʈ ������ ���
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// btn1 Ŭ���� �ϰ��� �ϴ� �ڵ带 ����
				System.out.println("1�� ��ư ������");

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i <5; i++) {
					
					
				System.out.println("2�� ��ư");
			
				}

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("3�� ��ư");

			}
		});

		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("4�� ��ư");

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
