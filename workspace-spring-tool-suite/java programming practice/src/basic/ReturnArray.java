package basic;

public class ReturnArray {
	static int[] makeArray() {
		int temp [] = new int[4];
		for (int i=0; i<temp.length; i++)
			temp[i] = i;
		return temp;
	}
	
	
	public static void main(String[] args) {
		int intArray[];		// 배열 레퍼런스 변수 선언
		intArray = makeArray();
		for (int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
	}
}
