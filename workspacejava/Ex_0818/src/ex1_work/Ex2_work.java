package ex1_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		
		//배열의 길이 : 3
		//ABC
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 길이 : ");
		int l = scan.nextInt();
		
		int abc[] = new int[l];
		
		for (int i = 0; i < abc.length; i++) {
			abc[i] += 'A'+i; 
			System.out.print((char)abc[i] + " ");
		}//for
		                                                                           
		
	}//main
}
