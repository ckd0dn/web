package ex3_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		
		ArrayList<Person> arr = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		
		
	out : while(true) {
			Person p =  new Person();
			
			System.out.println("id :");
			p.setId(sc.next());
			
			System.out.println("pwd : ");
			p.setPwd(sc.nextInt());
			
			//중복체크
			for (int i = 0; i < arr.size(); i++) {
				
				if( p.getId().equalsIgnoreCase(arr.get(i).getId()) ) {
					System.out.println("중복된 아이디 혹은 비밀번호");
					continue out;
				}//if
			}//for
			
			arr.add(p);
			
			for (int i = 0; i < arr.size(); i++) {
				//aaa /1111
				
				
				System.out.printf("%s / %d \n",arr.get(i).getId(),arr.get(i).getPwd());
			}//for
			
			
		}//while
		
	
	}//main
}
