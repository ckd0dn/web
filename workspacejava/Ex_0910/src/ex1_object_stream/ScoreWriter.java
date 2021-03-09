package ex1_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class ScoreWriter {
	//객체(RspInfo)를 통째로 파일로 저장하기 위한 클래스
	public ScoreWriter(RspInfo info) {
		
		//C:/창우 자바/Game/유저아이디/Gamesave.sav
		String path = "C:/창우 자바/Game/"+info.getId()+"/Gamesave.sav";
		
		File dir1 = new File("C:/창우 자바/Game");
		
		if(!dir1.exists()) {
			
			dir1.mkdirs();//Game폴터를 생성!!
		}
		
		//Game폴더는 반드시 존재하는 상황
		File dir2 = new File( dir1, info.getId());
		
		if(!dir2.exists()) {
			dir2.mkdirs();
		}
		
		//파라미터로 넘겨받은 info객체를 통째로 저장
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;//클래스를 통째로 저장할 수 있도록 하는 보조 스트림
		
		try {
			//파일쓰기
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			//info객체를 Gamesave.sav파일로 기록
			oos.writeObject( info );
			
		} catch (Exception e) {
			e.printStackTrace();//오류이름 확인!!
			System.out.println("기록저장 실패");
		} finally {
			
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}//생성자
}
