import java.util.*;
public class AcmePay {
    public static void main(String[] args) throws Exception 
    {
        int retire = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter shift - 1 , 2 , or 3");
        int shift = input.nextInt();

      //ask for hours worked
      
      //ask for participation in retirement plan if the second or third shift are selected

        double rate = payRate(shift);
        double gross = grossPay(rate, hours);
        
        System.out.println("Hours worked is " + hours);
        System.out.println("Hourly pay rate is " + rate);
        hoursBreakdown(rate, hours);
        retirementPay(shift, retire, gross);
    }

    public static double payRate(int shift)
    {
        //fill in the details 
          
    return rate;
    }

    public static void hoursBreakdown(double rate, double hours)
    {
        //fill in details
    }

    public static double grossPay(double rate, double hours)
    {
        //fill in details 
      
        return pay;
    }

    public static void retirementPay(int shift ,int choice, double gross)
    {
        //fill in details

        System.out.println("Retirment Deduction is " + retire);
        System.out.println("Net Pay is ...................." + netPay);
    }
}