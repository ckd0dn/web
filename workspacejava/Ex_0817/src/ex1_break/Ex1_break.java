package ex1_break;

public class Ex1_break {
	 public static void main(String[] args) {
		 
		 //break�� : �ݺ��� ������ ���������� ���� ����� �ݺ����� �������� ��
		 //����ϴ� Ű����
		 for(int i = 1 ; i <=2 ; i++) {
			 
			 for(int j = 1 ; j <= 5 ; j++) {
				 
				 if (j % 3 == 0 ) {
					break; 
					//break�� �ٷ� �Ʒ����� ��� �ڵ嵵 �߰��� �� ����. 
				}
				 
				 System.out.print(j + " ");
				 
			 }//inner
			 
			 System.out.println();
			 
		 }//outer
		 
	}//main
}
