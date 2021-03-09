package ex2_output;

import java.io.PrintStream;

public class Ex1_Output {
	public static void main(String[] args) {
		//PrintStream은 OutputStream의 대표적인 자식클래스로써
		//화면에(콘솔창) 데이터를 출력하도록 하는 클래스
		PrintStream ps = null;
		
		try {
			
			ps = System.out;
			ps.write(65);
			ps.write('B');
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			//ps는 close()가 없으면 작업이 미완성 되었다고 판단하여
			//화면에 데이터를 출력하지 않습니다.
			ps.close();
			
		}
	}//main
}
