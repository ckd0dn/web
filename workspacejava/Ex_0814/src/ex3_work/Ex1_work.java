package ex3_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		//04 05 06 07 12 13 14 15 20 21 22 23 28 29 30
		//16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
		//01 03 05 07 09 11 13 15 17 19 21 23 25 27 29
		//08 09 10 11 12 13 14 15 24 25 26 27 28 29 30
		//02 03 06 07 10 11 14 15 18 19 22 23 26 27 30
		
		Scanner scan = new Scanner(System.in);
		
		int n =0;
		int sum=0;
		
		System.out.println("04 05 06 07 12 13 14 15 20 21 22 23 28 29 30");
		System.out.println("생각한 숫자가 있나요?? 맞다(1), 틀리다(0)");
		
		n = scan.nextInt();
		if(n==1) {
			sum+=4;
		}
		
		System.out.println("16 17 18 19 20 21 22 23 24 25 26 27 28 29 30");
		System.out.println("생각한 숫자가 있나요?? 맞다(1), 틀리다(0)");
		
		n = scan.nextInt();
		if(n==1) {
			sum+=16;
		}
		System.out.println("01 03 05 07 09 11 13 15 17 19 21 23 25 27 29");
		System.out.println("생각한 숫자가 있나요?? 맞다(1), 틀리다(0)");
		
		n = scan.nextInt();
		if(n==1) {
			sum+=1;
		}
		System.out.println("08 09 10 11 12 13 14 15 24 25 26 27 28 29 30");
		System.out.println("생각한 숫자가 있나요?? 맞다(1), 틀리다(0)");
		
		n = scan.nextInt();
		if(n==1) {
			sum+=8;
		}
		System.out.println("02 03 06 07 10 11 14 15 18 19 22 23 26 27 30");
		System.out.println("생각한 숫자가 있나요?? 맞다(1), 틀리다(0)");
		
		n = scan.nextInt();
		if(n==1) {
			sum+=2;
		}
		
		System.out.printf("당신이 생각한 숫자는 %d 입니다",sum);
	}//main
}
