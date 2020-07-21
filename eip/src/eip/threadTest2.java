package eip;

public class threadTest2 extends Thread {
	public static void main(String[] args) {
		
	}
	
	public void run() {
		
		try {
			for (int j=0; j<11; j++) {
				System.out.print(j);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
