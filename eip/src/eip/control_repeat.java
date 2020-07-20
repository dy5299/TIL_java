package eip;

import java.util.Scanner;

public class control_repeat {
	public static void main(String[] args) {
		
		int a = 1;
		

		System.out.println(">> if-elif=else");
		if(a > 0) {
			if (a == 1) {
				System.out.println("a는 1입니다.");
			} else {
				System.out.println("a는 0보다 크다.");
			}
		}else if(a < 0) {
			System.out.println("a는 0보다 크지 않습니다.");
		} else {
			System.out.println("a는 0입니다.");
		}
		
		
		System.out.println();
		System.out.println(">> switch");
		switch(a) {
		// 조건식 결과는 무조건 정수 또는 문자열이어야 사용 가능
			case 1:
				System.out.println("a는 1입니다.");
				break;
			case 2:
				System.out.println("a는 2입니다.");
				break;
			case 3:
				System.out.println("a는 3입니다.");
				break;
			default :
				System.out.println("a는 0입니다.");
				// if문의 else처럼 생략 가능
				// default문에는 break; 생략 가능
				// default의 위치는 상관 없지만 순서가 마지막이 아니고, 다른 결과값과 혼동되지 않으려면 break; 를 추가
				// default는 가급적 맨 마지막에 사용
		}
		
		

		System.out.println();
		System.out.println(">> for");
		for (int i = 1; i <= 9; i++) {	// 초기화식, 조건식, 증감식
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d \t",  i, j, i*j);
			}
			System.out.println();
		}
		
		

		System.out.println();
		System.out.println(">> while");
		int i = 1;
		while (i < 5) {
			System.out.println("HELLO LADIES");
			i++;
		}
		
		

		System.out.println();
		System.out.println(">> do-while");
		// while문은 조건식이 맞지 않아도 실행되지만,
		// do-while문은 무조건 한 번 이상은 수행되어야만 한다.
		i = 0;
		do {
			System.out.println("DO");
		} while(i==5);
		
		
		// 많이 쓰이진 않지만, 반복적으로 입력을 받을 때 가장 유용하게 쓰인다.
		System.out.println();
		System.out.println(">> do-while 예제");
		int num = 0;
		int answer = 6;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("2 곱하기 3은?");
			num = sc.nextInt();
			
			if(num == answer) {
				System.out.println("정답입니다!");
			} else {
				System.out.println("땡! 다시 입력해주세요.");
			}
		} while(num != answer);
	}
}
