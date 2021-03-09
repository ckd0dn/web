package ex4_array;

import java.util.Random;

public class Ex4_work {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		//1 ~ 45 사이의 난수를 발생시켜 lotto 배열에 중복되지 않도록
		//담은 후, 순차적으로 출력하기

		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = new Random().nextInt(45) + 1;

			for (int j = 0; j < i; j++) {

				if(lotto[i] == lotto[j] ) {

					i--;

				}//if


			}//inner
		}//outer
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}//main
}
