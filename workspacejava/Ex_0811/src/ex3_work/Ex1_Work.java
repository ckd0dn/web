package ex3_work;

public class Ex1_Work {
	
	public static void main(String[] args) {
		
		/*
		 과수원이 있다.
		 배, 사과, 오렌지를 키우고있는데, 하루 생산량은 각각 
		 5, 7, 5개다.
		 
		  과수원에서 하루에 생산되는 과일의 총 갯수를 출력하고, 시간당
		  전체 과일의 평균 생산 갯수를 출력
		  
		  단, 과일의 갯수와 하루 생산량을 저장할 변수는 int타입으로,
		  평균 생산량을 저장할 변수는 float타입으로 지정하도록 한다)
		  */
		 
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int sum = pear + apple + orange;
		float avg = (float)sum/24f;
		
		System.out.println(" 과수원에서 하루에 생산되는 과일의 총 갯수 : " + sum + "개");
		System.out.println("시간당 전체 과일의 평균 생산 갯수를 출력 :" + avg + "개");
		
		System.out.printf(" 과수원에서 하루에 생산되는 과일의 총 갯수 : %d개\n", sum);
		System.out.printf("시간당 전체 과일의 평균 생산 갯수를 출력 : %.4f개\n:", avg);
		
	}
}
