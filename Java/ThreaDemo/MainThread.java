package ThreaDemo;

public class MainThread  extends Thread{
	
	public void run() {
		System.out.println("New Thread Running");
	}
	

	public static void main(String[] args) {	
		
		
		MainThread t1 = new MainThread();
		
		Thread t = new Thread(t1);
		t.start();
		System.out.println("Main Thread Running");
	}

}
