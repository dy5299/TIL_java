package basic;

public class ArrayTest1 {
	public static void main(String[] args) {
		int tenArray[] = new int[10];			// 선언 및 생성
		System.out.println("배열의 크기는 "+tenArray.length);	// 배열의 크기
		
		int sum=0;
		for(int i=0; i<10; i++) {
			tenArray[i]=i+1;
			sum+=i;
		}
		System.out.println("모든 원소의 합은 "+sum);
		
	}
}
