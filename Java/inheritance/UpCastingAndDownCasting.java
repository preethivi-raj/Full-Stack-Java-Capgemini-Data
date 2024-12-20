package inheritance;


class A {
	public void M1() {
		System.out.println("M1 Method in Class A");
	}
}

class B extends A {
    public void M2() {
        System.out.println("M2 Method in Class B");
    }
}



public class UpCastingAndDownCasting {

	public static void main(String[] args) {
	   
		B b = new B();
		
		A a = b; // Upcasting
		
		a.M1();	// M1 Method in Class A
		
		//downcasting
		
		A a1 = new B();
		B b1 = (B) a1;
		b1.M1(); // M1 Method in Class A
		b1.M2(); // M2 Method in Class B
		
		//safe downcasting
		
		A a2 = new B();
		
		if (a2 instanceof B) {
			B b2 = (B) a2;
			b2.M1(); // M1 Method in Class A
			b2.M2(); // M2 Method in Class B
		}
		else {
			System.out.println("Cannot downcast");
		}
		
	}

}
