package Interface;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	double apply(double a , double b);
	
	default double safeDiv(double a , double b) {
		if(b==0) {
			System.out.println("Invalid Division");
			return Double.NaN;
		}
		
		return a/b;
		
	}
	
	static double add(double a , double b) {
		return a+b;
	}
	
	static double sub(double a , double b) {
		return a-b;
	}
	
	static double mul(double a , double b) {
		if(b==0) {
			System.out.println("Invalid Division");
			return Double.NaN;
		}
		
		return a/b;
	}
}
