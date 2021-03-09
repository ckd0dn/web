package ex1_array_list;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list  = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		System.out.println(list.size());
		
		//300이라는 값을 꺼내와보자!
		int res = list.get(2);
		System.out.println(res);
		
		System.out.println("-----------------");
		
		list.add(1,400);//1번 index에 400을 추가 뒤의 인덱스는 밀려나게 됨
		list.set(2, 500);//2번 index의 값을 500으로 수정
		list.add(600);
		System.out.println(list);
		
		//2번 index의 데이터를 삭제
		list.remove(2);
		
		//list안에 담긴 값을 for문을 통해 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		
	}//main
}
