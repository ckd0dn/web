package ex1_computer;

public class Computer {
	//��ǻ�͸� �뷮���� �ϱ� ���� ���赵
	private String company = "LG";
	int hdd = 500;
	int ram = 16;
	float cpu = 2.5f;
	String color = "white";

	//��ǻ���� ������ ��ȯ�ϴ� �޼���
	//�޼���� ��� �۾��� �����ϱ����� ��ɹ��� ����
	//���� ���Ǵ� �ڵ带 �޼���� ����θ� �ʿ��� ������ ȣ�⸸ �ؼ� ����� �� �ִ�.
	public void getInfo() {
		
		System.out.println("������ : " + company);
		System.out.println("hdd : " + hdd + "GB" );
		System.out.println("ram : " + ram + "GB");
		System.out.println("cpu : " + cpu + "GHz");
		System.out.println("color : " + color );
		System.out.println("-----------------------" );
	}//getInfo()
	
	//�޼����� ����
	//���������� ��ȯ�� �޼����
	//public void getInfo( �Ķ����(����) ){ �޼����� ���� ���� }
	
	//����������
	//1.public : ���� ������Ʈ ���� ��� ��ü�鿡�� ����� �㰡
	//2.private : ���� Ŭ���� ������ ����� �㰡
	//3.protected : ��Ӱ����� ��ü������ ����� �㰡
	//4.default : ���� ��Ű�� ���� ��ü�� ����� �㰡
}
