package ex4_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex1_Set {
	public static void main(String[] args) {
		
		//컬렉션 프레임워크 : 다수의 데이터(객체)를 표준화된 프로그램 방식으로
		//개발 가능하게 하는 클래스들...
		
		//Set : java.util패키지에 존재하는 인터페이스
		//특정 코드에서 중복된 값을 허용해서는 안될 때 사용하는 인터페이스
		//HashSet : 정렬기능은 없다.
		//TreeSet :	오름차순 정렬
		
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
		ts2.add("홍길동");
		ts2.add("차길순");
		ts2.add("김초복");
		ts2.add("이중복");
		
		System.out.println(ts2);
		
		
	}//main
}
