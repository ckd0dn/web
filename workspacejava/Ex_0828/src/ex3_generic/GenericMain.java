package ex3_generic;

public class GenericMain {
	public static void main(String[] args) {
		
		Ex1_Generic<String> v1 = new Ex1_Generic<>();
		v1.setValue("스트링타입의 값");
		String res = v1.getValue();
		System.out.println(res);
		
		Ex1_Generic<Integer> v2 = new Ex1_Generic<>();
		v2.setValue(100);
		int res2 = v2.getValue();
		System.out.println(res2);
		
		Ex1_Generic<Character> v3 = new Ex1_Generic<>();
		v3.setValue('ㅇ');
		char res3 = v3.getValue(); 
		System.out.println(res3);
		
 	}//main
	
}
