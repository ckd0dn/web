package ex4_array;

import java.util.Random;

public class Ex4_work {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		//1 ~ 45 ������ ������ �߻����� lotto �迭�� �ߺ����� �ʵ���
		//���� ��, ���������� ����ϱ�

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
