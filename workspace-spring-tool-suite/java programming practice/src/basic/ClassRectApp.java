package basic;

import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}

public class ClassRectApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		System.out.print("���ο� ���δ�?");;
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();				
		System.out.println("�� ���簢���� ������ " + rect.getArea() + "�Դϴ�.");
		
		scanner.close();
	}
}
