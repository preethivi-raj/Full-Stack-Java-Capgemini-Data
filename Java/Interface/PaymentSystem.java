package Interface;

class HSBC implements PymentMethod{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("HSBC is processing the payment of Rs. "+ amount );
	}

	@Override
	public void applyDiscount(double amount) {
		// TODO Auto-generated method stub
		System.out.println("HSBC applies a special discount on payment ");
		
	}
	
}

class AxisBank implements PymentMethod{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("AXIS is processing the payment of Rs. "+ amount );
	}

	@Override
	public void applyDiscount(double amount) {
		// TODO Auto-generated method stub
		System.out.println("AXIS applies a special discount on payment "+amount);
	}
	
}
class FlipKart implements Store{

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 10.0;
	}

	@Override
	public void checkOut(double amount, PymentMethod paymentMethod) {
		// TODO Auto-generated method stub
		double discount = getDiscount();
		double discountAmount = amount -(amount * discount /100);
		System.out.println("Flipkart applies a "+discount +"%discount . Total payable "+ discountAmount);
		paymentMethod.applyDiscount(discountAmount);
		paymentMethod.processPayment(discountAmount);
		
	}
	
}

class Myntra implements Store{

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 15.0;
	}

	@Override
	public void checkOut(double amount, PymentMethod paymentMethod) {
		// TODO Auto-generated method stub
		double discount = getDiscount();
		double discountAmount = amount -(amount * discount /100);
		System.out.println("Myntra applies a "+discount +"%discount . Total payable "+ discountAmount);
		paymentMethod.applyDiscount(discountAmount);
		paymentMethod.processPayment(discountAmount);
		
	}
	
}
class Amazon implements Store{

	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 20.0;
	}

	@Override
	public void checkOut(double amount, PymentMethod paymentMethod) {
		// TODO Auto-generated method stub
		double discount = getDiscount();
		double discountAmount = amount -(amount * discount /100);
		System.out.println("Amazon applies a "+discount +"%discount . Total payable "+ discountAmount);
		paymentMethod.applyDiscount(discountAmount);
		paymentMethod.processPayment(discountAmount);
		
		
	}
	
}
public class PaymentSystem {

	public static void main(String[] args) {
		
		PymentMethod hsbc = new HSBC();
		PymentMethod axis = new AxisBank();
		
		
   Store f = new FlipKart();
   Store m = new Myntra();
   Store a = new Amazon();
   
   System.out.println(" Customer shopping at Flipkart ");
   
   System.out.println(" customer shopping at Myntra ");
   
   
   System.out.println(" Customer shopping at Amazon ");
	}

}

