package ex5_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3_Map {
	public static void main(String[] args) {

		//id : aaa
		//pw : 1111
		//���̵� �������� �ʽ��ϴ�.

		//id : lee
		//pw : 4444
		//��й�ȣ�� ��ġ���� �ʽ��ϴ�.

		//id : kim
		//pw : 1111
		//�α��� ����!


		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);

		Scanner sc = new Scanner(System.in);

		System.out.println("id : ");
		String id = sc.next();//���ڿ�
		
		System.out.println("pwd : ");
		int pwd = sc.nextInt();//����
		
		if ( !map.containsKey(id)) {
			//�Է¹��� ���� map�� Ű������ ���ԵǾ� ���� �������(id�� ���� ���)
			System.out.println("id�� �������� �ʽ��ϴ�");
		}else {
			
			//���̵� ��ġ�ϴ� ���
			if ( map.get(id) != pwd) {
				System.out.println("��й�ȣ ����ġ");
			}else {
				System.out.println("�α��� ����!!");
			}
		}




	}//main
}
