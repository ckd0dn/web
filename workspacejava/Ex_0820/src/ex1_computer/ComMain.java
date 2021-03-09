package ex1_computer;

public class ComMain {
	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		System.out.println(c1.hdd);
		System.out.println(c1.ram);
		System.out.println(c1.cpu);
		System.out.println(c1.color);
		
		System.out.println("-------------------------");
		
		Computer c2 = new Computer();
		c2.hdd = 1000;
		System.out.println(c2.hdd);
		System.out.println(c2.ram);
		System.out.println(c2.cpu);
		System.out.println(c2.color);
		
		System.out.println("-------------------------");
		
		//private 접근제한자를 가진 변수나 메서드는 타 클래스에서 사용불가 
		//c2.Company = "apple";
	}//main
}
