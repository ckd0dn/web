package ex1_object_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class ScoreWriter {
	//��ü(RspInfo)�� ��°�� ���Ϸ� �����ϱ� ���� Ŭ����
	public ScoreWriter(RspInfo info) {
		
		//C:/â�� �ڹ�/Game/�������̵�/Gamesave.sav
		String path = "C:/â�� �ڹ�/Game/"+info.getId()+"/Gamesave.sav";
		
		File dir1 = new File("C:/â�� �ڹ�/Game");
		
		if(!dir1.exists()) {
			
			dir1.mkdirs();//Game���͸� ����!!
		}
		
		//Game������ �ݵ�� �����ϴ� ��Ȳ
		File dir2 = new File( dir1, info.getId());
		
		if(!dir2.exists()) {
			dir2.mkdirs();
		}
		
		//�Ķ���ͷ� �Ѱܹ��� info��ü�� ��°�� ����
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;//Ŭ������ ��°�� ������ �� �ֵ��� �ϴ� ���� ��Ʈ��
		
		try {
			//���Ͼ���
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			//info��ü�� Gamesave.sav���Ϸ� ���
			oos.writeObject( info );
			
		} catch (Exception e) {
			e.printStackTrace();//�����̸� Ȯ��!!
			System.out.println("������� ����");
		} finally {
			
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
	}//������
}
