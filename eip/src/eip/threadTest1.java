package eip;

public class threadTest1 extends Thread{

	public static void main(String[] args) {
		
	}
	
	public void run() {
		
		try {
			for (char a = 'A'; a <= 'Z'; a++) {
				System.out.print(a);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
