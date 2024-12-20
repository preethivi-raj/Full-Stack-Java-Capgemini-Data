package Interface;

@FunctionalInterface
interface SalaryInterface{
	//double calculateSalary(double salary);
	
	String authorWinningName(String name);
}

public class FunctionalINterface {

	public static void main(String[] args) {
		
//		double baseSalary =20000;
//		
//		SalaryInterface withBonus = (sal) -> sal+(sal*1.1);
//		
//		SalaryInterface withDeduction = (sal)-> sal-(sal*0.05);
//		
//		SalaryInterface noChange = (sal)-> sal;
//		
//		
//		System.out.println("Base Salary"  + baseSalary);
//		System.out.println("WithBonus "+ withBonus.calculateSalary(baseSalary));
//		System.out.println("With Deduction  " + withDeduction.calculateSalary(baseSalary));
//		System.out.println("No CHnage "+  noChange.calculateSalary(baseSalary) );
		
		
		String authorName ="Vijay";
		
		SalaryInterface book  =  (name)-> "The Author Name : "+name + ", The Book Name is : Sad Life," + "\nYear : 2000" + " Award : Best Comedy Story";
		
		SalaryInterface flim  = (name)-> "The Author Name : "+name + ", The Flim Name is : Interstellar,"  + "\nYear 2014"  + " Award  : Best Si-fi Movie";
		
		
		System.out.println("Book : \n" + book.authorWinningName(authorName));
		System.out.println("*************************************************");
		System.out.println("Flim : \n"+flim.authorWinningName(authorName));
		

	}

}
