
package basic;

public class ClassCircle {
	public int radius;
	public String name;
	
	public ClassCircle() {	// ������
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		ClassCircle pizza;			// ���۷��� ���� ����
		pizza = new ClassCircle();		// ��ü �޸� �Ҵ� �� ��ü ����
		
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		ClassCircle donut = new ClassCircle();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}
