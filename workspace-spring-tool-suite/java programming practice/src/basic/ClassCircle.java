
package basic;

public class ClassCircle {
	public int radius;
	public String name;
	
	public ClassCircle() {	// 생성자
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		ClassCircle pizza;			// 레퍼런스 변수 선언
		pizza = new ClassCircle();		// 객체 메모리 할당 및 객체 생성
		
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		ClassCircle donut = new ClassCircle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
