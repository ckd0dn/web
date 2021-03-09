package p;

public class Square {
	 int width;
	 int height;
	
	public int getArea(int width, int height ) {
		
				
		return width * height;
		
	}
	
	public int getRound(int a , int b) {
		
		a = this.width;
		b = this.height;
		return 2*width + 2*height;
	}
}
