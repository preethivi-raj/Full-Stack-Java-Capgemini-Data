package Interface;


public interface PymentMethod {
	void processPayment(double amount);
	void applyDiscount(double amount);

}


interface Store {

	double getDiscount();//Returns the discount percentage for the store.
	void checkOut( double amount , PymentMethod paymentMethod);
}








