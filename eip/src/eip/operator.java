package eip;

public class operator {
	public static void main(String[] args) {
		System.out.println(">> 부호 연산자");
		int w = -10;
		int result1 = +w;
		int result2 = -w;
		
		System.out.println("w = " + w);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		
		
		System.out.println();
		System.out.println(">> 증감 연산자");
		int i = 0;
		System.out.println("i첫번째 = " + i);
		
		i++;
		System.out.println("i두번째 = " + i);
		
		i = 0;
		
		++i;
		System.out.println("i세번째 = " + i);
		
		int j = 10;
		System.out.println("j첫번째 = " + j);
		
		j--;
		System.out.println("j두번째 = " + j);
		
		j = 10;
		
		--j;
		System.out.println("j세번째 = " + j);
		
		
		
		System.out.println();
		System.out.println(">> 증감 연산자 2 - 전위형");
		i = 10;
		j = 0;
		
		j = ++i;		// i 먼저 증가하고 값 복사
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		
		
		System.out.println();
		System.out.println(">> 증감 연산자 2 - 후위형");
		i = 10;
		j = 0;
		
		j = i++;		// i 먼저 복사하고 i 증가
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		
		
		System.out.println();
		System.out.println(">> 산술 연산자");
		int x = 7;
		int y = 2;
		
		System.out.printf("%d + %d = %d \n", x, y, x + y);
		System.out.printf("%d - %d = %d \n", x, y, x - y);
		System.out.printf("%d * %d = %d \n", x, y, x * y);
		System.out.printf("%d / %d = %d \n", x, y, x / y);
		System.out.printf("%d / %d 으로 나눌 경우, 몫은 %d 이며 나머지는 %d 입니다.", x, y, x/y, x%y);
		
		
		
		System.out.println();
		System.out.println(">> 비교(관계) 연산자");
		x = 7;
		y = 2;
		
		System.out.printf("%d > %d \t\t %b \n", x, y, x > y);
		System.out.printf("%d < %d \t\t %b \n", x, y, x < y);
		System.out.printf("%d <= %d \t\t %b \n", x, y, x <= y);
		System.out.printf("%d >= %d \t\t %b \n", x, y, x >= y);
		System.out.printf("%d == %d \t\t %b \n", x, y, x==y);
		System.out.printf("%d != %d \t\t %b \n", x, y, x!=y);
		
		

		System.out.println();
		System.out.println(">> 삼항 연산자");
		int a = (2>1) ? 100 : 0;
		System.out.println(a);
		
		int b = (1>2) ? 100 : 0;
		System.out.println(b);
	}
}
