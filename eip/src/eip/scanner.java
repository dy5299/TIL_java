package eip;

import java.util.*;

public class scanner {
	public static void main(String[] arge) {
		int age;
		char a;
		String name;
		
		Scanner scanner = new Scanner(System.in);	// 스캐너 클래스 객체 생성
		
		System.out.println("당신의 나이는 몇 살?");
		
		age = scanner.nextInt();		// 숫자를 입력받는 scanner의 메소드 중 하나
		a = scanner.next().charAt(0);
		name = scanner.nextLine();
		name = scanner.nextLine();		// 남은 enter값 때문에 오작동하는 것을 방지

		System.out.println("저의 나이는 " + age + "살.");
		System.out.println("저의 혈액형은 " + a + "형.");
		System.out.println("저의 이름은 " + name + ".");		
	}
}
