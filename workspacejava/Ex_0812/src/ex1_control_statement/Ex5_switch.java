package ex1_control_statement;

public class Ex5_switch {
	public static void main(String[] args) {
		
		String str = "C";
		
		switch(str){//�񱳰�
		
		case "A":
			System.out.println("90 ~ 100");
			break;
		case "B":
			System.out.println("80 ~ 89");
			break;
		case "C":
			System.out.println("70 ~ 79");
			break;
		case "D":
			System.out.println("60 ~ 69");
			break;
		case "F":
			System.out.println("59�� ����");
			break;
			
		default :
			System.out.println("������ �ùٸ��� �ʽ��ϴ�");
			break;
		}
		
	}//main
}
