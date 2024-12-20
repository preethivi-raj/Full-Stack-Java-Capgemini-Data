package ThreaDemo;

public class OurThread extends Thread {
	String task;
	
	OurThread(String task){
		this.task =task;
	}
	
	public void run() {
		System.out.println("Thread is running");
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(i+" :  "+task);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		
		OurThread th1 = new OurThread("Cut the ticket");
		OurThread th2 = new OurThread("Show you seat Number");
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		
		t1.start();
		t2.start();

	}

}
