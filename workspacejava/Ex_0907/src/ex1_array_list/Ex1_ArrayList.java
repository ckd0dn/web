package ex1_array_list;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list  = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println(list.size());
		
		//300�̶�� ���� �����ͺ���!
		int res = list.get(2);
		System.out.println(res);
		
		System.out.println("-----------------");
		
		list.add(1,400);//1�� index�� 400�� �߰� ���� �ε����� �з����� ��
		list.set(2, 500);//2�� index�� ���� 500���� ����
		list.add(600);
		System.out.println(list);
		
		//2�� index�� �����͸� ����
		list.remove(2);
		
		//list�ȿ� ��� ���� for���� ���� ���
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
	}//main
}
