package eip;

public class jarray {
	public static void main(String[] args) {
		
		int[] value;		// int type�� value ��� ������ �迭 ����
		value = new int[5];	// int type�� ���̰� 5�� value��� ������ �迭 ����
		
		int[] value2 = new int[5];	// �迭 ����� ������ �� ����
		
		
		
		// �迭�� ũ�� ���� �� ���� ��� ����
		int a = 5;
		int[] array = new int[a];
		
		for (int i = 0; i < a; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		
		
		
		// �迭�� ����
		int[] age = new int[5];
		int new2 = age.length;
		System.out.println("���̴� " + new2);
		
		
		int[] array2 = new int[0];		// �ʱⰪ 0
		String[] array3 = new String[0];	// �ʱⰪ ""
		
		
		
	}
}
