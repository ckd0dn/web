package ex4_array;

public class Ex2_single_array {
	public static void main(String[] args) {
		
		char[] ch = new char[4];
		ch[0] = 'A';
		ch[1] = 'B';
		ch[2] = 'C';
		ch[3] = 'D';
		
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		
		//ch�迭�� ���� ������  for���� ����Ͽ� ���
		for(char c : ch) {
			System.out.println(c);
		}
		System.out.println("--------------------------");
		
		//�迭�� ����, ����, �ʱ�ȭ�� �ѹ���
		String[] str = {"hong", "kim", "lee", "park"};
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] );
		}
		
		System.out.println("--------------------------------");
		
		//������ for��
		for(String s : str) {
			//�迭�� �� index�� ���� ������ �Ұ��� 
			System.out.println(s);
		}
	}//main
}
