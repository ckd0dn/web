package ex1_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		
		//������ �߻���Ű�� RandomŬ����
		
		//��) 1 ~ 4  ������ ���� �߻�
		// new Random().nextInt(�߻��� ������ ����) + ���ۼ�;
		// �߻��� ������ ���� = ū�� -���� �� + 1 
		int num = new Random().nextInt(4) + 1;
		System.out.println(num);
		
		//���ĺ� �빮���� �ϳ��� �������� ȭ�鿡 ���
		//��� : F
		
		int c = new Random().nextInt(90-65+1) + 65;
		int s = new Random().nextInt('Z'-'A'+1) + 'A';
		System.out.println((char)c);
	}//main
}
