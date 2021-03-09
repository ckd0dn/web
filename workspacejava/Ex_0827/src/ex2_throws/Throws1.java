package ex2_throws;

public class Throws1 {

	//throws : 현재 메서드에서 발생할 수 있는 예외를
	//타 클래스에서 처리하도록 위임하는 키워드
	public void test() throws Exception{
	
		int n = 0;
		int result = 0;
			
		result = 10 / n;
		
		System.out.println(result);
	}
	
}









