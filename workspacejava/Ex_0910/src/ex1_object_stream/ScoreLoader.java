package ex1_object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ScoreLoader {
	
	private RspInfo info;
	
	public RspInfo getinfo() {
		return info;
	}
	
	//생성자
	
	public ScoreLoader(String id) {
		String path = "C:/창우 자바/Game/"+ id +"/Gamesave.sav";
		
		File f = new File(path);
		
		if( f.exists()) {//물리적으로 파일이 존재할때 true
			
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			//파일로드
			try {
				
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				info = (RspInfo)ois.readObject();
				System.out.println("로드완료");
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("로드실패");
			} finally {
				
				try {
					ois.close();
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
			
		}else {
			System.out.println("아이디 생성을 환영합니다.");
		}
	}
}
