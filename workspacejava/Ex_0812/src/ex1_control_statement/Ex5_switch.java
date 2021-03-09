package ex1_control_statement;

public class Ex5_switch {
	public static void main(String[] args) {
		
		String str = "C";
		
		switch(str){//비교값
		
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
			System.out.println("59점 이하");
			break;
			
		default :
			System.out.println("성적이 올바르지 않습니다");
			break;
		}
		
	}//main
}
