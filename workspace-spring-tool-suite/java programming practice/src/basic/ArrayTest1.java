package basic;

public class ArrayTest1 {
	public static void main(String[] args) {
		int tenArray[] = new int[10];			// ���� �� ����
		System.out.println("�迭�� ũ��� "+tenArray.length);	// �迭�� ũ��
		
		int sum=0;
		for(int i=0; i<10; i++) {
			tenArray[i]=i+1;
			sum+=i;
		}
		System.out.println("��� ������ ���� "+sum);
		
	}
}
