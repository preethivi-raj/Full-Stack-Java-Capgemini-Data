package FIleStream;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter Your Name :");
            String name = s.nextLine();
            System.out.println("Enter the Phone Number :");
            String phoneNumber = s.nextLine();
            System.out.println("Enter the Account Number : ");
            long accountNumber = s.nextLong();
            System.out.println("Enter the money you want to credit  : ");
            double money = s.nextDouble();

            System.out.println("************************************************************");

            System.out.println("Name  : " + name);
            System.out.println("Phone Number : " + phoneNumber);
            System.out.println("Account Number  : " + accountNumber);
            System.out.println("Money : " + money);
            
            
            
            BufferedWriter bw = new BufferedWriter( new FileWriter("C:\\Users\\PM103\\Downloads\\taskData.txt", true));

            bw.write("Name  : " + name + "\n");
            bw.write("Phone Number : " + phoneNumber + "\n");
            bw.write("Account Number : " + accountNumber + "\n");
            bw.write("Money : " + money + "\n");
            bw.write("*************************************************** \n");

            System.out.println("Data Added");

           
            bw.close();
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
