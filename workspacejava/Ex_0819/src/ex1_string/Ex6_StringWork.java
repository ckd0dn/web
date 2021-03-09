package ex1_string;

import java.util.Scanner;

public class Ex6_StringWork {
	public static void main(String[] args) {

		//숙제!!
		//아래 배열을 통해 배우와 작품을 검색하는 로직을 작성

		//배우명 : 송강호
		//[송강호]
		//박쥐
		//괴물
		//관상

		//배우명 : aaa
		//해당 배우가 존재하지 않습니다

		String[][] actor = {{"[송강호]","박쥐","괴물","관상"}
		,{"[이병헌]","광해","내부자들","놈놈놈"},{"[마동석]","성난황소","부산행","범죄도시"}};

		Scanner sc = new Scanner(System.in);

		System.out.println("배우명 : ");
		String act = sc.next();//배우명 받기
		int bau = 0;

		String[] act2 = {"","",""}; //배우명 비교


		for (int i = 0; i < actor.length; i++) {
			act2[i] += actor[i][0].substring(1, 4);
		}//배우명 act2에 넣기



		a : for (int i = 0; i < actor.length; i++) {

			for (int j = 0; j < actor[i].length; j++) {


				if (act2[i].equals(act)) {
					System.out.println(actor[i][j]);
					bau = 1;
				}//if
				
				
			}//inner
			
		}//outer
		
		if (bau == 0) {
			System.out.println("배우가 존재하지 않습니다");
		}
		
		



	}//main
}
