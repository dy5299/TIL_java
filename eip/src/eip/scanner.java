package eip;

import java.util.*;

public class scanner {
	public static void main(String[] arge) {
		int age;
		char a;
		String name;
		
		Scanner scanner = new Scanner(System.in);	// ��ĳ�� Ŭ���� ��ü ����
		
		System.out.println("����� ���̴� �� ��?");
		
		age = scanner.nextInt();		// ���ڸ� �Է¹޴� scanner�� �޼ҵ� �� �ϳ�
		a = scanner.next().charAt(0);
		name = scanner.nextLine();
		name = scanner.nextLine();		// ���� enter�� ������ ���۵��ϴ� ���� ����

		System.out.println("���� ���̴� " + age + "��.");
		System.out.println("���� �������� " + a + "��.");
		System.out.println("���� �̸��� " + name + ".");		
	}
}
