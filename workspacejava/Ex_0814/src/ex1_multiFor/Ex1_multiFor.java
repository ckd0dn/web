package ex1_multiFor;

public class Ex1_multiFor {
	public static void main(String[] args) {

		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}//for
	
		//        *
		//      * * *
		//    * * * * * 
		//  * * * * * * *
		//* * * * * * * * *
		for (int i = 0 ; i < 5; i++) {

			for (int j = 0; j < 5 + i; j++) {
				if(i+j>3) {
					System.out.print("* ");			
				}else {
					System.out.print("  ");
				}
			}//inner

			System.out.println();

		}//outer

		System.out.println("----------------------------");

		//1 2 3 4 5 6 7 8 9 10
		//2 3 4 5 6 7 8 9 10 1 
		//3 4 5 6 7 8 9 10 1 2
		//. . .
		//10 1 2 3 4 5 6 7 8 9

		for (int i = 1; i <= 10 ; i++) {

			for (int j = i; j < 10+i; j++) {

				if(j>10) {
					System.out.print(j-10+ " " );
				}
				else {
					System.out.print(j + " ");
				}
			}//inner
			System.out.println();
		}//outer
	}//main
}
