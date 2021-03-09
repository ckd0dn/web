package ex1_computer;

public class Computer {
	//컴퓨터를 대량생산 하기 위한 설계도
	private String company = "LG";
	int hdd = 500;
	int ram = 16;
	float cpu = 2.5f;
	String color = "white";

	//컴퓨터의 정보를 반환하는 메서드
	//메서드란 어떠한 작업을 수행하기위한 명령문의 집합
	//자주 사용되는 코드를 메서드로 묶어두면 필요할 때마다 호출만 해서 사용할 수 있다.
	public void getInfo() {
		
		System.out.println("제조사 : " + company);
		System.out.println("hdd : " + hdd + "GB" );
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "GHz");
		System.out.println("color : " + color );
		System.out.println("-----------------------" );
	}//getInfo()
	
	//메서드의 구성
	//접근제한자 반환형 메서드명
	//public void getInfo( 파라미터(인자) ){ 메서드의 실행 영역 }
	
	//접근제한자
	//1.public : 같은 프로젝트 내의 모든 객체들에게 사용을 허가
	//2.private : 현재 클래스 에서만 사용을 허가
	//3.protected : 상속관계의 객체에서만 사용을 허가
	//4.default : 같은 패키지 내의 객체만 사용을 허가
}
