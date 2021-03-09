package ex5_collection;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {
	public static void main(String[] args) {
		
		//Map : 키(key)와 값(value)을 묶어서 하나의 데이터로 저장
		//키를 통해서 값을 검색하므로 많은 양의 데이터를 검색하는데 있어서
		//속도적으로 뛰어난 성능을 보여준다.
		HashMap<Integer, Boolean> map1 = new HashMap<Integer, Boolean>();
		
		map1.put(1, true);
		map1.put(2, true);
		map1.put(3, false);
		map1.put(4, true);
		map1.put(5, true);
		map1.put(5, false);//맵은 value의 중복은 허용하나 , key 의 중복은 허용하지 않는다. 
		map1.remove(2);//key값이 2인 value를 제거
		
		
		System.out.println(map1);
		
		System.out.println(map1.get(1));
		
		//boolean res = map1.get(2);
		//System.out.println(res);
		
		//map1이 3이라는 이름의 key를 가지고 있다면 참
		if (map1.containsKey(4)) {
			
			System.out.println(map1.get(3));
			
		}
		
		if (map1.containsValue(true)) {
			System.out.println("map1에는 true라는 값이 저장 되어있습니다");
			
		}
		
		
	}//main
}
