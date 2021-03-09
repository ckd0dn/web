package ex1_work;

import java.util.Random;

public class Ex3_work {
	public static void main(String[] args) {
		
		//변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다
		//단, 3450, 2100....과 같이 1의자리 숫자는 0이 되도록 난수를 만든다.
		//발생한 난수 money를 500원, 100원, 50원, 10원짜리 동전으로 바꾸면
		//각각 몇개씩 거슬러 지는지를 판단하시오.
		//단, 가능한 한 가장 적은수의 동전으로 거슬러 줄 것 .
		
		//금액 : 2590 <--- 난수로 발생된 금액
		//500원 : 5
		//50원 : 1
		//10원 : 4
		
		int money =  new Random().nextInt(500)+1;
		
		money *= 10;
		
		int[] coin = {500, 100, 50, 10};
		int[] n = new int[4];
		
		System.out.println("money : " + money);
		
		for (int i = 0; i < coin.length; i++) {
			
			n[i] = money / coin[i];
			
			if( n[i] > 0) {
			money %= coin[i];
			System.out.println(coin[i] + "원 : " + n[i] );
			}//if
			
		}//for
		
		
	}//main
}
