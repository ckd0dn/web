package ex2_array_list;

import java.util.ArrayList;

public class UserTest {
	public static void main(String[] args) {
		
		ArrayList<User>  arr = new ArrayList<User>();
		User u = new User();
		u.setName("홍길동");
		u.setAge(20);
		
		User u2 = new User();
		u2.setName("김길동");
		u2.setAge(30);
		
		
		arr.add(u);
		arr.add(u2);
		
		
		
		//arr에 담긴 User객체의 정보를 출력
		for (int i = 0; i < arr.size(); i++) {
			
			System.out.println(arr.get(i).getName());
			System.out.println(arr.get(i).getAge());
			System.out.println("---------------------------------");;
		}
		
	}//main
}
