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
	
	oop() {		// 기본 생성자
		System.out.println("생성자의 이름은 클래스명과 같아야 한다.");
		System.out.println("생성자는 메소드이지만 return값이 없다.");
		System.out.println("타입, 변수가 없을 수도 있으며, 아무런 내용이 없을 수 있다.");
	}
	
	oop(int size, int weight){		// 매개변수가 있는 생성자
		System.out.println("클래스의 필드를 내가 원하는 값으로 초기화하고 싶을 때");
		this.size = size;
		this.weight = weight;
	}
	
	
	
	public static void main(String[] args) {
		
		Notebook flex = new Notebook();		// Notebook class로부터 instance 생성
		
		flex.size = 5;
		flex.weight = 2;
		flex.color = "파랑";
		flex.volume = 0;
		flex.power = false;
		
		flex.power();		// 메소드
		flex.volumeUp();
		
		for(int i = 0; i < 30; i++) {
			flex.volumeUp();
		}
		
		flex.volumeDown();
		
		
	}
}



class Sandwich{
	String ingredient;		// 재료
	
	Sandwich(){		// 기본 생성자
	}
	
	Sandwich(String ingredient){		// 매개변수가 있는 생성자
		this.ingredient = ingredient;
	}
}



public class phonebook {
	
	int phoneNumber;
	String personName;
	
	phonebook(int number, String name){
		// this: 클래스에서 생성된 인스턴스
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
