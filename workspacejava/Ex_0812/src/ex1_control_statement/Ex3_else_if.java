package ex1_control_statement;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		//����if��(else if ) : �������� ���Ǻ񱳰� �ʿ��� ��� ����ϴ� ��� 
		
		int num = 40;
		String str = "";
		
		if(num >= 90) {
			str ="A";
		}
		else if(num>=80){
			str ="B";
		}
		else if(num>=70){
			str ="C";
		}
		else if(num>=60){
			str ="D";
		}
		else {
			//������ ��� ������ ������ �� ������ ����Ǵ� ����
			str ="F";
		}
		System.out.println(str);
	}//MAIN
}
