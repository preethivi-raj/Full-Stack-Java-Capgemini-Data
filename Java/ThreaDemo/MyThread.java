package ThreaDemo;

public class MyThread implements Runnable {
    int a =10;
    int b=20;
    
	@Override
	public void run() {
		add();
		sub();
		mul();
	}
	
	public void add() {
		int sum = a+b;
		System.out.println("Sum  : " + sum);
	}
	
	public void sub() {
		int sub = a>b ? a-b  : b-a;
		System.out.println("Sum  : " + sub);
	}
	
	public void mul() {
		int mul = a*b;
		System.out.println("Mul  : "+mul);
	}

	public static void main(String[] args) {
		
		System.out.println("Main Thread Running.....");
		MyThread th = new MyThread();
		Thread  t= new Thread(th);
		t.start();

	}

}
