package ex1_object_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ScoreLoader {
	
	private RspInfo info;
	
	public RspInfo getinfo() {
		return info;
	}
	
	//������
	
	public ScoreLoader(String id) {
		String path = "C:/â�� �ڹ�/Game/"+ id +"/Gamesave.sav";
		
		File f = new File(path);
		
		if( f.exists()) {//���������� ������ �����Ҷ� true
			
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			//���Ϸε�
			try {
				
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);
				info = (RspInfo)ois.readObject();
				System.out.println("�ε�Ϸ�");
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("�ε����");
			} finally {
				
				try {
					ois.close();
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
			
		}else {
			System.out.println("���̵� ������ ȯ���մϴ�.");
		}
	}
}
