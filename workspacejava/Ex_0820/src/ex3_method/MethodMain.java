package ex3_method;

public class MethodMain {
	public static void main(String[] args) {
		
		ValueTest v1 = new ValueTest();
		int su = 100;
		su = v1.test1(su);
		System.out.println("su :" + su);
		
		String name = "ȫ�浿";
		int age = 21;
		String res = v1.test2(age);
		System.out.printf("%s���� %s �Դϴ�\n", name, res);
		
		System.out.println("--�̽��ڸ��� ����---");
		boolean result = v1.test3("��", 21);
		
		if (result == true) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
	}//main
}

