package ex2_array_list;

import java.util.ArrayList;

public class UserTest {
	public static void main(String[] args) {
		
		ArrayList<User>  arr = new ArrayList<User>();
		User u = new User();
		u.setName("ȫ�浿");
		u.setAge(20);
		
		User u2 = new User();
		u2.setName("��浿");
		u2.setAge(30);
		
		
		arr.add(u);
		arr.add(u2);
		
		
		
		//arr�� ��� User��ü�� ������ ���
		for (int i = 0; i < arr.size(); i++) {
			
			System.out.println(arr.get(i).getName());
			System.out.println(arr.get(i).getAge());
			System.out.println("---------------------------------");;
		}
		
	}//main
}
