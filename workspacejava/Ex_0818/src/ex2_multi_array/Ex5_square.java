package ex2_multi_array;

import java.util.Scanner;

public class Ex5_square {//마방진
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 1;//시작수
		int size = 0;//마방진 사이즈
		int y = 0;//y행
		int x = 0;//x행
		
		System.out.println("홀수 입력 : ");
		size = scan.nextInt();
		
		x = size / 2 ;
		
		int[][] arr = new int[size][size];
		
		while(num <= size * size) {
			
			arr[y][x] = num;
			
			if(num % size == 0) { y++;}
			else {y--; x++;}
			
			if(y < 0) {y = size - 1;}
			
			if(x >= size) {x = 0;}
			
			num++;
		}
		
		//마방진 출력
		for (int i = 0; i < size; i++) {
			
			for (int j = 0; j < size; j++) {
				
				System.out.printf("%02d ",arr[i][j]);
				
			}//inner
			System.out.println();
		}//outer
		
		
	}//main
}
