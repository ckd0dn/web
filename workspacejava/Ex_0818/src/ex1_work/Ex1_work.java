package ex1_work;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		//1 ~ 45 사이의 난수를 발생시켜 lotto 배열에 중복되지 않도록
		//담은 후, 순차적으로 출력하기

		outer : for (int i = 0; i < lotto.length;                                                                        ) {

			lotto[i] = new Random().nextInt(6) + 1;

			//경우의 수(중복체크)를 위한 반복문
			for (int j = 0; j < i; j++) {

				if(lotto[i] == lotto[j]) {
					continue outer;   //outer의 조건식으로 이동해서 난수를 다시만듬
				}//if

			}//inner

			System.out.print(lotto[i] + " ");
			i++;



		}//outer




	}//main
}
