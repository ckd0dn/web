package ex5_collection;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {
	public static void main(String[] args) {
		
		//Map : Ű(key)�� ��(value)�� ��� �ϳ��� �����ͷ� ����
		//Ű�� ���ؼ� ���� �˻��ϹǷ� ���� ���� �����͸� �˻��ϴµ� �־
		//�ӵ������� �پ ������ �����ش�.
		HashMap<Integer, Boolean> map1 = new HashMap<Integer, Boolean>();
		
		map1.put(1, true);
		map1.put(2, true);
		map1.put(3, false);
		map1.put(4, true);
		map1.put(5, true);
		map1.put(5, false);//���� value�� �ߺ��� ����ϳ� , key �� �ߺ��� ������� �ʴ´�. 
		map1.remove(2);//key���� 2�� value�� ����
		
		
		System.out.println(map1);
		
		System.out.println(map1.get(1));
		
		//boolean res = map1.get(2);
		//System.out.println(res);
		
		//map1�� 3�̶�� �̸��� key�� ������ �ִٸ� ��
		if (map1.containsKey(4)) {
			
			System.out.println(map1.get(3));
			
		}
		
		if (map1.containsValue(true)) {
			System.out.println("map1���� true��� ���� ���� �Ǿ��ֽ��ϴ�");
			
		}
		
		
	}//main
}
