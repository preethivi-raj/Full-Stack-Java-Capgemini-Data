package assignment;

 class EmployeeSalary {

    
    static final double COMPANY_PERK_PERCENTAGE = 0.10;  
    static final double TAX_RATE = 0.15; 

     private String name;
     private String department ;
     private double basicSalary;
     

    
    public EmployeeSalary(String name,String department ,double basicSalary) {
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    
    private  double calculateHRA() {
        return 0.40 * basicSalary; 
    }

    private  double calculateTA() {
        return 0.10 * basicSalary; 
    }

    private double calculateDA() {
        return 0.20 * basicSalary;
    }

    private double calculatePerks() {
        return basicSalary * COMPANY_PERK_PERCENTAGE; 
    }

   
    private static double calculateTax(double totalSalary) {
        return totalSalary * TAX_RATE; 
    }

   
    private double calculateTotalSalary() {
        double totalSalary = basicSalary + calculateHRA() + calculateTA() + calculateDA() + calculatePerks();
        return totalSalary;
    }

    private double calculateNetSalary() {
        double totalSalary = calculateTotalSalary();
        double tax = calculateTax(totalSalary);
        return totalSalary - tax;
    }
    
    public void display () {

        System.out.println("Employee: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("HRA: " + this.calculateHRA());
        System.out.println("TA: " + this.calculateTA());
        System.out.println("DA: " + this.calculateDA());
        System.out.println("Perks: " + this.calculatePerks());
        System.out.println("Total Salary: " + this.calculateTotalSalary());
        System.out.println("Net Salary after Tax: " + this.calculateNetSalary());
    }

}

public class Main {
    
    public static void main(String[] args) {
       
        EmployeeSalary emp1 = new EmployeeSalary("Vijay", "Group-IT" ,100000);
        
        emp1.display();

       
    }
}


