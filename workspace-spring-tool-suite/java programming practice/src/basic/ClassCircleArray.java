package basic;

class Circle {
	int radius;
	Circle(int radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return 3.14*radius*radius;
	}
}

public class ClassCircleArray {
	public static void main(String[] args) {
		Circle [] c = new Circle[5];
		
		for(int i=0; i<c.length; i++)
			c[i] = new Circle(i);
		
		for(int i=0; i<c.length; i++)
			System.out.print(  (int)(c[i].getArea()) + " "  );
	}
}
