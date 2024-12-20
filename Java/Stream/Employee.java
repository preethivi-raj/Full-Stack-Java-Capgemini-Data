package Stream;

import java.util.Arrays;

public class Employee {

    public static void main(String[] args) {
      
        double[] salaries = {35000, 50000, 38000, 45000, 10000, 25000, 80000, 37000};

        System.out.println("Sal above the 40000 : ");
        
        Arrays.stream(salaries) 
                 .filter(salary -> salary < 40000)
                 .forEach(System.out::println); 
		
        System.out.println("Sal above the 75000 : ");
		
		Arrays.stream(salaries) 
		        .filter(sal -> sal > 75000)
		        .forEach(System.out::println);
		
		System.out.println("Provide Increment for Employees: ");
		
		Arrays.stream(salaries)
		        .map(salary -> (salary >= 33000 && salary <= 37000) ?  (salary * 1.10) : salary)
				.forEach(System.out::println);
		
		System.out.println("Average of the salary");
		
		double avg=Arrays.stream(salaries)
		      .average()
		      .orElse(0.0);
		System.out.println(avg);
		
		
		System.out.println("Total turnover of the company");
		double turnover =0.0;
		for(double sal  : salaries) {
			turnover += sal*avg;
		}
		System.out.println(turnover);
		
		
	   System.out.println("Arrange Data in Descending Order: ");
	    
	   Arrays.stream(salaries)
	          .boxed()
	          .sorted()
	          .forEach(System.out::println);
    }
}
