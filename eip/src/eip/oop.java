package eip;

class Notebook {
	
	int size;
	int weight;
	int volume;
	String color;
	boolean power;
	
	void power() {
		power =! power;
	}
	
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	
}

public class oop {
	
	oop() {		// �⺻ ������
		System.out.println("�������� �̸��� Ŭ������� ���ƾ� �Ѵ�.");
		System.out.println("�����ڴ� �޼ҵ������� return���� ����.");
		System.out.println("Ÿ��, ������ ���� ���� ������, �ƹ��� ������ ���� �� �ִ�.");
	}
	
	oop(int size, int weight){		// �Ű������� �ִ� ������
		System.out.println("Ŭ������ �ʵ带 ���� ���ϴ� ������ �ʱ�ȭ�ϰ� ���� ��");
		this.size = size;
		this.weight = weight;
	}
	
	
	
	public static void main(String[] args) {
		
		Notebook flex = new Notebook();		// Notebook class�κ��� instance ����
		
		flex.size = 5;
		flex.weight = 2;
		flex.color = "�Ķ�";
		flex.volume = 0;
		flex.power = false;
		
		flex.power();		// �޼ҵ�
		flex.volumeUp();
		
		for(int i = 0; i < 30; i++) {
			flex.volumeUp();
		}
		
		flex.volumeDown();
		
		
	}
}



class Sandwich{
	String ingredient;		// ���
	
	Sandwich(){		// �⺻ ������
	}
	
	Sandwich(String ingredient){		// �Ű������� �ִ� ������
		this.ingredient = ingredient;
	}
}



public class phonebook {
	
	int phoneNumber;
	String personName;
	
	phonebook(int number, String name){
		// this: Ŭ�������� ������ �ν��Ͻ�
		this.phoneNumber = number;
		this.personName = name;
	}
	
	void info() {
		System.out.println("number: " + phoneNumber + " name: " + personName);
	}
	
	
	public static void main(String arg[]) {
		phonebook obj1 = new phonebook(01099903333, "Bob");
		phonebook obj2 = new phonebook(01033332222, "Jo");
		obj1.info();
		obj2.info();
	}
	
}
