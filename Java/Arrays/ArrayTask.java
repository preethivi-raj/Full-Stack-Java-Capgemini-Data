package Arrays;

public class ArrayTask {
	
	public static double hra(double sal) {
		return sal*0.1;
	}
	
	public static double ta(double sal) {
		return sal*0.05;
	}
	
	public static double da(double sal) {
		return sal*0.08;
	}

	public static void main(String[] args) {
		
		double salary []= {10000.0f , 30000.0f , 20000.0f , 50000.0f , 100000.0f , 45000.0f};
		
		for(int i=0 ; i<salary.length ; i++) {
			
			if(salary[i]>=30000.0f) {
				salary[i]=(salary[i] * 1.1);
				System.out.println("Employee Id : "+i+1+"| After Increment : "+ salary[i]) ;
			}
			else if(salary[i]== 20000.0f) {
				salary[i]=salary[i]+2000.0f;
				System.out.println("Employee Id : "+i+1+"| After bonus : "+salary[i]);
			}
			else if(salary[i] < 15000.0f) {
				System.out.println("Employee Id : "+i+1+"| Work Hard :)");
			}
	
			System.out.println("--------------------------------------------------------------------");
			salary[i]=salary[i]+hra(salary[i])+ta(salary[i])+da(salary[i]);
			
		}
		
		System.out.println("After all Allowances added");
		System.out.println("--------------------------------------------------------------------");
		for(int i=0 ; i<salary.length ; i++) {
			System.out.println("Employee Id : "+i+1+ " | " + salary[i]+ " ");
		}

	}

}
