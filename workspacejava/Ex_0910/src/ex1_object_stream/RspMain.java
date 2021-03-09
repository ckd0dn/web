package ex1_object_stream;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {
		
		RspInfo info = new RspInfo();
		
		Scanner sc = new Scanner(System.in);
		String id = "";
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		System.out.print("id : ");
		id = sc.next();
		info.setId(id);
		
		//���̵� �Է¹��� �� �ε��۾� ����!!
		try {
			
		
		ScoreLoader sl = new ScoreLoader( id );
		
		
		win = sl.getinfo().getWin();
		lose = sl.getinfo().getLose();
		draw = sl.getinfo().getDraw();
		
		info.setWin(win);
		info.setDraw(draw);
		info.setLose(lose);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.printf("%d��, %d��, %d��\n", win, lose, draw);
		
		while(true) {
			
			int random = new Random().nextInt(3);//0~2������ ����
			//0:����, 1:����, 2:��
			
			System.out.println("����(s) | ����(r) | ��(p) : ");
			String user = sc.next();//s, r, p�� �ϳ��� Ű���忡�� �Է��� �޴´�!!
			
			//����ڰ� ���� ���� ������ ��ȯ
			int usercnt = 0;
			
			switch (user) {
			case "s":
				usercnt = 0;
				break;

			case "r":
				usercnt = 1;
				break;
			case "p":
				usercnt = 2;
				break;
			
				
				
			}
			
			
			
			//����� �� �Ǵ�
			if( usercnt - random == -2 || usercnt - random == 1) {
				//������ �̱���
				System.out.println("�̰���ϴ�!");
				info.setWin(++win);
			}else if( usercnt - random == 0) {
				//�����
				System.out.println("�����ϴ�!");
				info.setDraw(++draw);
			}else {
				//�� ���
				System.out.println("�����ϴ٤Ф�");
				info.setLose(++lose);
			}
			
			System.out.printf("%d��, %d��, %d��\n", info.getWin(), info.getLose(), info.getDraw());
		
			System.out.println("���� ��? y | n : ");
			String exit = sc.next();
			
			if( !exit.equalsIgnoreCase("y") ) {
				System.out.println("������ �����մϴ�");
				break;
			}
			
		}//while
		
		//�������� ��, info��ü�� ��°�� ����
		new ScoreWriter( info );
	}//main
}
