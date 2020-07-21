package eip;

public class jarray {
	public static void main(String[] args) {
		
		int[] value;		// int type의 value 라는 변수의 배열 선언
		value = new int[5];	// int type의 길이가 5인 value라는 변수의 배열 선언
		
		int[] value2 = new int[5];	// 배열 선언과 생성을 한 번에
		
		
		
		// 배열의 크기 지정 시 변수 사용 가능
		int a = 5;
		int[] array = new int[a];
		
		for (int i = 0; i < a; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		
		
		
		// 배열의 길이
		int[] age = new int[5];
		int new2 = age.length;
		System.out.println("길이는 " + new2);
		
		
		int[] array2 = new int[0];		// 초기값 0
		String[] array3 = new String[0];	// 초기값 ""
		
		
		
	}
}
