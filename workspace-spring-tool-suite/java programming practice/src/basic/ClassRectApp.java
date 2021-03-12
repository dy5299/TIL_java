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
		
		System.out.print("가로와 세로는?");;
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();				
		System.out.println("이 직사각형의 면적은 " + rect.getArea() + "입니다.");
		
		scanner.close();
	}
}
