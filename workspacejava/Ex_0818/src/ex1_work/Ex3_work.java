package ex1_work;

import java.util.Random;

public class Ex3_work {
	public static void main(String[] args) {
		
		//���� money�� 10 ~ 5000������ ������ �߻����� �ִ´�
		//��, 3450, 2100....�� ���� 1���ڸ� ���ڴ� 0�� �ǵ��� ������ �����.
		//�߻��� ���� money�� 500��, 100��, 50��, 10��¥�� �������� �ٲٸ�
		//���� ��� �Ž��� �������� �Ǵ��Ͻÿ�.
		//��, ������ �� ���� �������� �������� �Ž��� �� �� .
		
		//�ݾ� : 2590 <--- ������ �߻��� �ݾ�
		//500�� : 5
		//50�� : 1
		//10�� : 4
		
		int money =  new Random().nextInt(500)+1;
		
		money *= 10;
		
		int[] coin = {500, 100, 50, 10};
		int[] n = new int[4];
		
		System.out.println("money : " + money);
		
		for (int i = 0; i < coin.length; i++) {
			
			n[i] = money / coin[i];
			
			if( n[i] > 0) {
			money %= coin[i];
			System.out.println(coin[i] + "�� : " + n[i] );
			}//if
			
		}//for
		
		
	}//main
}
