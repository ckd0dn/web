package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		//IO( Input, Output)
		//IO는 입출력 스트림을 의미한다
		//스트림이란 데이터를 입출력하기위한 일종의 통로
		//프로그램에서 파일을 읽어들인다던지, 콘솔의 값을 가져오는 등의 작업이 가능
		//JVM에서 콘솔로 값을 내보낼때는 Output, 콘솔의 값을 JVM이 읽어올땐 Input
		String path = "C:/창우 자바/test.txt";
		File f = new File( path );
		
		if( f.isFile() ) { //!f.isDirectory() <-- 이렇게도 가능 !!!
			
			System.out.println("파일의 크기 : " + f.length() + "byte" );
			
		}
		
		
	}//main
}
