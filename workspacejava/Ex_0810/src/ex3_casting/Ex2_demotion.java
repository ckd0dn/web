package ex3_casting;

public class Ex2_demotion {
	
	public static void main(String[] args) {
		
		//2.���� ĳ����
		//���� �ڷ����� ū �ڷ����� �����ϴ� ��(�ڵ����� �̷�����x)
		char c ='A';//2byte
		int n = c + 1;//4byte
		c = (char)n;
		System.out.println("c :" +  c );
		
		//system.out.println ����� syso ctrl space
		
		System.out.println("---------------------------------");
		
		float f = 5.5f;
		int num = 0;
		num = (int)f;
		
		System.out.println("num : " + num);
	}

}
