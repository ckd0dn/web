package ex1_control_statement;

public class Ex4_switch {
	public static void main(String[] args) {
		
		//switch - case�� : �񱳰��� ���ǰ��� ���� ����� �����ϴ� ���
		//switch(�񱳰�){
		//case ���ǰ� :
		// �񱳰��� ���ǰ��� ��ġ�ϴ� ��� ����Ǵ� ����
		// break;
		//}
		int n = 2;
		switch(n ) {//�񱳰�
		case 1: //���ǰ�
			System.out.println("���ӽ���");
			break;
			
		case 2: 
			System.out.println("���ӼҰ�");
			break;
			
		case 3: 
			System.out.println("��������");
			break;
			
		default:
			//�񱳰��� ���ǰ��� �Ѱ��� ��ġ���� ���� �� �ݵ�� ����Ǵ� ����
			System.out.println("�߸��� �޴�");
			break;
		}//switch
		
	}//main
}
