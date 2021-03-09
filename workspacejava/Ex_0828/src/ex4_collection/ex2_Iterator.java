package ex4_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class ex2_Iterator {
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; set.size() < 6; i ++) {
			set.add(new Random().nextInt(45)+1);
		}
		
		System.out.println(set);
		
		//Set�� ���� ���� �Ű� ������� �迭
		int[] arr = new int[set.size()];

		//Set������ Ư�� �ε����� ������ �� ���� ������ ������ �������� ���ؼ���
		//iterator��� �ϴ� '�ݺ���'�� ����ؾ� �Ѵ�.
		Iterator<Integer> it = set.iterator();
		
		for (int i = 0; i < set.size(); i++) {
			
			arr[i] = it.next();
			System.out.print(arr[i] + " ");
		}
	}//main
}
