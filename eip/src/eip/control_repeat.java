package eip;

import java.util.Scanner;

public class control_repeat {
	public static void main(String[] args) {
		
		int a = 1;
		

		System.out.println(">> if-elif=else");
		if(a > 0) {
			if (a == 1) {
				System.out.println("a�� 1�Դϴ�.");
			} else {
				System.out.println("a�� 0���� ũ��.");
			}
		}else if(a < 0) {
			System.out.println("a�� 0���� ũ�� �ʽ��ϴ�.");
		} else {
			System.out.println("a�� 0�Դϴ�.");
		}
		
		
		System.out.println();
		System.out.println(">> switch");
		switch(a) {
		// ���ǽ� ����� ������ ���� �Ǵ� ���ڿ��̾�� ��� ����
			case 1:
				System.out.println("a�� 1�Դϴ�.");
				break;
			case 2:
				System.out.println("a�� 2�Դϴ�.");
				break;
			case 3:
				System.out.println("a�� 3�Դϴ�.");
				break;
			default :
				System.out.println("a�� 0�Դϴ�.");
				// if���� elseó�� ���� ����
				// default������ break; ���� ����
				// default�� ��ġ�� ��� ������ ������ �������� �ƴϰ�, �ٸ� ������� ȥ������ �������� break; �� �߰�
				// default�� ������ �� �������� ���
		}
		
		

		System.out.println();
		System.out.println(">> for");
		for (int i = 1; i <= 9; i++) {	// �ʱ�ȭ��, ���ǽ�, ������
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
		// while���� ���ǽ��� ���� �ʾƵ� ���������,
		// do-while���� ������ �� �� �̻��� ����Ǿ�߸� �Ѵ�.
		i = 0;
		do {
			System.out.println("DO");
		} while(i==5);
		
		
		// ���� ������ ������, �ݺ������� �Է��� ���� �� ���� �����ϰ� ���δ�.
		System.out.println();
		System.out.println(">> do-while ����");
		int num = 0;
		int answer = 6;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("2 ���ϱ� 3��?");
			num = sc.nextInt();
			
			if(num == answer) {
				System.out.println("�����Դϴ�!");
			} else {
				System.out.println("��! �ٽ� �Է����ּ���.");
			}
		} while(num != answer);
	}
}
