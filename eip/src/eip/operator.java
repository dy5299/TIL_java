package eip;

public class operator {
	public static void main(String[] args) {
		System.out.println(">> ��ȣ ������");
		int w = -10;
		int result1 = +w;
		int result2 = -w;
		
		System.out.println("w = " + w);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		
		
		System.out.println("\n" + ">> ���� ������");
		int i = 0;
		System.out.println("iù��° = " + i);
		
		i++;
		System.out.println("i�ι�° = " + i);
		
		i = 0;
		
		++i;
		System.out.println("i����° = " + i);
		
		int j = 10;
		System.out.println("jù��° = " + j);
		
		j--;
		System.out.println("j�ι�° = " + j);
		
		j = 10;
		
		--j;
		System.out.println("j����° = " + j);
		
		
		
		System.out.println("\n" + ">> ���� ������ 2 - ������");
		i = 10;
		j = 0;
		
		j = ++i;		// i ���� �����ϰ� �� ����
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		

		System.out.println("\n" + ">> ���� ������ 2 - ������");
		i = 10;
		j = 0;
		
		j = i++;		// i ���� �����ϰ� i ����
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		

		System.out.println("\n" + ">> ��� ������");
		int x = 7;
		int y = 2;
		
		System.out.printf("%d + %d = %d \n", x, y, x + y);
		System.out.printf("%d - %d = %d \n", x, y, x - y);
		System.out.printf("%d * %d = %d \n", x, y, x * y);
		System.out.printf("%d / %d = %d \n", x, y, x / y);
		System.out.printf("%d / %d ���� ���� ���, ���� %d �̸� �������� %d �Դϴ�.", x, y, x/y, x%y);
		
		
		System.out.println("\n" + ">> ��(����) ������");
		x = 7;
		y = 2;
		
		System.out.printf("%d > %d \t\t %b \n", x, y, x > y);
		System.out.printf("%d < %d \t\t %b \n", x, y, x < y);
		System.out.printf("%d <= %d \t\t %b \n", x, y, x <= y);
		System.out.printf("%d >= %d \t\t %b \n", x, y, x >= y);
		System.out.printf("%d == %d \t\t %b \n", x, y, x==y);
		System.out.printf("%d != %d \t\t %b \n", x, y, x!=y);
		
	}
}
