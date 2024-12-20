package ThreaDemo;

public class ThreadDemo implements Runnable {

	

	@Override
	public void run() {
		
      System.out.println("New Child Thread Running");
		
		for(int i=0 ; i<=5 ; i++) {
			System.out.println(i);
		}
		
		System.out.println(Thread.currentThread());
		
		
	}
	public static void main(String[] args) {
		ThreadDemo th = new ThreadDemo();
		
		Thread t = new Thread(th);
		t.start();

		System.out.println("Main Thread running ....");
	}
}
