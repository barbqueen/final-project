package Java;
import java.util.*;

public class AcmePay {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter shift - 1, 2, or 3");
            int shift = input.nextInt();

            System.out.println("Enter the number of hours worked:");
            double hours = input.nextDouble();

            int retire = 0;
            if (shift == 2 || shift == 3) 
            {
                System.out.println("Do you want to participate in the retirement plan? (1 for Yes, 0 for No)");
                retire = input.nextInt();
            }

            double rate = payRate(shift);
            double gross = grossPay(rate, hours);

            System.out.println("Hours worked is " + hours);
            System.out.println("Hourly pay rate is " + rate);
            hoursBreakdown(rate, hours);
            retirementPay(shift, retire, gross);
        }
    }

    public static double payRate(int shift) {
        double rate;
        if (shift == 1) 
        {
            rate = 17.0;
        } 
        else if (shift == 2) 
        {
            rate = 17.0 * 1.05; 
        } 
        else 
        {
            rate = 17.0 * 1.10; 
        }
        return rate;
    }

    public static void hoursBreakdown(double rate, double hours) {
        double overtimeHours = hours > 40 ? hours - 40 : 0;
        double regularHours = hours - overtimeHours;
        double overtimePay = overtimeHours * rate * 1.5;

        System.out.println("Regular Hours: " + regularHours);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Overtime Pay: " + overtimePay);
    }

    public static double grossPay(double rate, double hours) {
        double overtimeHours = hours > 40 ? hours - 40 : 0;
        double regularHours = hours - overtimeHours;
        return (regularHours * rate) + (overtimeHours * rate * 1.5);
    }

    public static void retirementPay(int shift, int choice, double gross) {
        double retire;
        if (choice == 1) 
        {
            retire = gross * 0.03;
        } 
        else 
        {
            retire = 0;
        }
        double netPay = gross - retire;

        System.out.println("Retirement Deduction is " + retire);
        System.out.println("Net Pay is " + netPay);
    }
}