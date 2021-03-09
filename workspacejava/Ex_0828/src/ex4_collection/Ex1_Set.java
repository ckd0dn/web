package ex4_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex1_Set {
	public static void main(String[] args) {
		
		//�÷��� �����ӿ�ũ : �ټ��� ������(��ü)�� ǥ��ȭ�� ���α׷� �������
		//���� �����ϰ� �ϴ� Ŭ������...
		
		//Set : java.util��Ű���� �����ϴ� �������̽�
		//Ư�� �ڵ忡�� �ߺ��� ���� ����ؼ��� �ȵ� �� ����ϴ� �������̽�
		//HashSet : ���ı���� ����.
		//TreeSet :	�������� ����
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(100);
		hs1.add(60);
		hs1.add(15);
		hs1.add(35);
		hs1.remove(35);
		
		System.out.println(hs1.size());
		hs1.clear();
		
		
		while(true) {
			
			int r = new Random().nextInt(45) + 1;
			hs1.add(r);
			
			if (hs1.size() == 6) {
				
				break;
			}
		}//while
		
		System.out.println(hs1);
		
		System.out.println("--------------------------------");
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
while(true) {
			
			int s = new Random().nextInt(45) + 1;
			ts.add(s);
			
			if (ts.size() == 6) {
				
				break;
			}
		}//while
	 	                          
		System.out.println(ts);
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("ȫ�浿");
		ts2.add("�����");
		ts2.add("���ʺ�");
		ts2.add("���ߺ�");
		
		System.out.println(ts2);
		
		
	}//main
}
