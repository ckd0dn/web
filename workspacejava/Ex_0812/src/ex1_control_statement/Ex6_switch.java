package ex1_control_statement;

public class Ex6_switch {
	public static void main(String[] args) {
		
		char ch = 'õ';
		
		switch (ch) {//�񱳰� - ���� , ����, ���ڿ��� ����
		case 'õ' :
			System.out.println("�ϴ� õ");
			break;
			
		case '��' :
			System.out.println("�� ��");
			break;
			
		case '��' :
			System.out.println("���� ��");
			break;

		default:
			System.out.println("õ,��,�� �߿����� �Է��ϼ���");
			break;
		}
	}
}
