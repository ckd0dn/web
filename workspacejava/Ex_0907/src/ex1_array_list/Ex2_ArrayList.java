package ex1_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2_ArrayList {
	public static void main(String[] args) {

		//id : aaa
		//[aaa]
		//id : bbb
		//[aaa, bbb]
		//id : aaa
		//�ߺ��� ���̵�
		//..........

		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		out : while(true) {

			System.out.println("id : ");
			String id = sc.next();

			//�ߺ�üũ 
			for (int i = 0; i < list.size(); i++) {

				if(id.equalsIgnoreCase(list.get(i))) {
					System.out.println("�ߺ��� ���̵�");
					continue out;
				}//if
			}//for
			
			list.add(id);

			System.out.println(list);



		}//while

	}//main
}
