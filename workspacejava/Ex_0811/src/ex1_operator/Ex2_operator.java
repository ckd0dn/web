package ex1_operator;

public class Ex2_operator {
	
	public static void main(String[] args) {
		
		//�񱳿�����
		//�񱳿����ڴ� ������ ����� ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
		
		int n1 = 10;
		int n2 = 20;
		boolean result = n1 < n2;
		
		System.out.println("n1 < n2 : " + result);
		
		result = n1 >= n2;
		System.out.println("n1 >= n2 : " + result);
		
		result = n1 == n2;
		System.out.println("n1 == n2 : " + result);
		
		result = n1 != n2;
		System.out.println("n1 != n2 : " + result);
		
		System.out.println("---------------------------------");
		
		//�������� 
		//�񱳿����ڸ� ���� ������ �� �� �̻� �ʿ��� �� ���
		int age = 21;
		int limit = 25;
		
		
		//&&(and)������ : ���� ������ false��� ���� ������ �������� �ʴ´�!!
		
		//true && true -> true
		//true && false -> false
		//false && true -> false
		//false && false -> false
		boolean res = limit - age >= 5 && (age += 2) > 20;
		System.out.println(age);
		System.out.println(res);
		System.out.println("---------------------------------");
		
		int i1 = 10;
		int i2 = 20;
		
		//||(or)������ :���� ������ true��� ���� ������ �������� �ʴ´�!!
		//true || true -> true
		//true || false -> true
		//false || true -> true
		//false || false -> false
		
		res = (i1 += 10) > 20 || i2 - 10 == 11; 
		System.out.println(res);
		System.out.println("---------------------------------");
		
		//!(not)������ : boolean���� ���ʿ� ����ϸ�,
		//���� ��������, ������ ������ ���� �Ͻ������� �������ش�.
		System.out.println(!res);
		System.out.println(res);
		res = !res;//���������� ���� �ٲٷ��� �̷���
		
 	}
	
}
