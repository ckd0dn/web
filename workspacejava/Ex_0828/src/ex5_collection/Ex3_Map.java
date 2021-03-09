package ex5_collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3_Map {
	public static void main(String[] args) {

		//id : aaa
		//pw : 1111
		//아이디가 존재하지 않습니다.

		//id : lee
		//pw : 4444
		//비밀번호가 일치하지 않습니다.

		//id : kim
		//pw : 1111
		//로그인 성공!


		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);

		Scanner sc = new Scanner(System.in);

		System.out.println("id : ");
		String id = sc.next();//문자열
		
		System.out.println("pwd : ");
		int pwd = sc.nextInt();//정수
		
		if ( !map.containsKey(id)) {
			//입력받은 값이 map에 키값으로 포함되어 있지 않은경우(id가 없는 경우)
			System.out.println("id가 존재하지 않습니다");
		}else {
			
			//아이디가 일치하는 경우
			if ( map.get(id) != pwd) {
				System.out.println("비밀번호 불일치");
			}else {
				System.out.println("로그인 성공!!");
			}
		}




	}//main
}
