package ex1_work;

import java.util.Random;

public class Ex1_work {
	public static void main(String[] args) {

		int[] lotto = new int[6];

		//1 ~ 45 ������ ������ �߻����� lotto �迭�� �ߺ����� �ʵ���
		//���� ��, ���������� ����ϱ�

		outer : for (int i = 0; i < lotto.length;                                                                        ) {

			lotto[i] = new Random().nextInt(6) + 1;

			//����� ��(�ߺ�üũ)�� ���� �ݺ���
			for (int j = 0; j < i; j++) {

				if(lotto[i] == lotto[j]) {
					continue outer;   //outer�� ���ǽ����� �̵��ؼ� ������ �ٽø���
				}//if

			}//inner

			System.out.print(lotto[i] + " ");
			i++;



		}//outer




	}//main
}
