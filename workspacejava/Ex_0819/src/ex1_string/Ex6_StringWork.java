package ex1_string;

import java.util.Scanner;

public class Ex6_StringWork {
	public static void main(String[] args) {

		//����!!
		//�Ʒ� �迭�� ���� ���� ��ǰ�� �˻��ϴ� ������ �ۼ�

		//���� : �۰�ȣ
		//[�۰�ȣ]
		//����
		//����
		//����

		//���� : aaa
		//�ش� ��찡 �������� �ʽ��ϴ�

		String[][] actor = {{"[�۰�ȣ]","����","����","����"}
		,{"[�̺���]","����","�����ڵ�","����"},{"[������]","����Ȳ��","�λ���","���˵���"}};

		Scanner sc = new Scanner(System.in);

		System.out.println("���� : ");
		String act = sc.next();//���� �ޱ�
		int bau = 0;

		String[] act2 = {"","",""}; //���� ��


		for (int i = 0; i < actor.length; i++) {
			act2[i] += actor[i][0].substring(1, 4);
		}//���� act2�� �ֱ�



		a : for (int i = 0; i < actor.length; i++) {

			for (int j = 0; j < actor[i].length; j++) {


				if (act2[i].equals(act)) {
					System.out.println(actor[i][j]);
					bau = 1;
				}//if
				
				
			}//inner
			
		}//outer
		
		if (bau == 0) {
			System.out.println("��찡 �������� �ʽ��ϴ�");
		}
		
		



	}//main
}
