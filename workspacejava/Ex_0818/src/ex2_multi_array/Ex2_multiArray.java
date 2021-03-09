package ex2_multi_array;

public class Ex2_multiArray {
	public static void main(String[] args) {
		
		String[][] student = {	{"¿µÈñ", "j:100","a:95"},
								{"Ã¶¼ö", "j:90"}	};
		
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				System.out.print(student[i][j] + "\t");
			}
			System.out.println();
		}
	}//main
}
