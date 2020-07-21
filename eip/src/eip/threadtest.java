package eip;

public class threadtest{
	
	public static void main(String[] args) {
		
		threadTest1 t1 = new threadTest1();
		threadTest2 t2 = new threadTest2();
		
		t1.start();
		t2.start();
		
	}
	
}

