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
		
		//Set이 가진 값을 옮겨 담기위한 배열
		int[] arr = new int[set.size()];

		//Set구조는 특정 인덱스로 접근할 수 없기 때문에 내용을 가져오기 위해서는
		//iterator라고 하는 '반복자'를 사용해야 한다.
		Iterator<Integer> it = set.iterator();
		
		for (int i = 0; i < set.size(); i++) {
			
			arr[i] = it.next();
			System.out.print(arr[i] + " ");
		}
	}//main
}
