package ex3_method;

public class ValueTest {

	public int test1(int n) {

		n+=100;
		System.out.println("n : " + n);

		return n;
	}//test1()

	public String test2(int age) {

		if (age >= 20) {
			return "�հ�";
		}

		return "���հ�";


	}//test2()
	
	public boolean test3(String gender, int age) {
		
		if (gender.equals("����") && age >= 20) {
			
			return true;
		}
		else {
			return false;
		}
	}
}
