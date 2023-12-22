package Java;
import java.util.Scanner;
import java.text.NumberFormat;

public class PizzaPOS {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName;
        boolean discount = false;
        int inches;
        char crustType;
        String crust = "Hand-tossed";
        double cost = 12.99;
        final double TAX_RATE = 0.08;
        double tax;
        char choice;
        String input;
        String toppings = "Cheese ";
        int numberOfToppings = 0;

        System.out.println("Welcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name: ");
        firstName = scan.nextLine();

        if (firstName.equalsIgnoreCase("Diane") || firstName.equalsIgnoreCase("Mike")) {
            discount = true;
        }

        System.out.println("Pizza Size (inches)   Cost");
        System.out.println("        10            $10.99");
        System.out.println("        12            $12.99");
        System.out.println("        14            $14.99");
        System.out.println("        16            $16.99");
        System.out.print("What size pizza would you like? 10, 12, 14, or 16 (enter the number only): ");
        inches = scan.nextInt();

        if (inches == 10) {
            cost = 10.99;
        } else if (inches == 12) {
            cost = 12.99;
        } else if (inches == 14) {
            cost = 14.99;
        } else if (inches == 16) {
            cost = 16.99;
        } else {
            System.out.println("Invalid size entered. Defaulting to 12-inch pizza.");
            inches = 12;
        }

        System.out.print("What type of crust do you want? (H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): ");
        input = scan.next();
        crustType = input.charAt(0);

        if (crustType == 'H' || crustType == 'h') {
            crust = "Hand-tossed";
        } else if (crustType == 'T' || crustType == 't') {
            crust = "Thin-crust";
        } else if (crustType == 'D' || crustType == 'd') {
            crust = "Deep-dish";
        } else {
            System.out.println("Invalid crust type entered. Defaulting to Hand-tossed.");
        }

        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each, choose from");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom");

        System.out.print("Do you want Pepperoni? (Y/N): ");
        input = scan.next();
        choice = input.charAt(0);

        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";
        }

        // Similar blocks for other toppings (Sausage, Onion, Mushroom) can be added here.

        cost = cost + (1.25 * numberOfToppings);

        System.out.println();
        System.out.println("Your order is as follows:");
        System.out.println(inches + " inch pizza");
        System.out.println(crust + " crust");
        System.out.println(toppings);

        if (discount) {
            System.out.println("You are eligible for a $2.00 discount.");
            cost -= 2;
        }

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("The cost of your order is: " + currencyFormat.format(cost));

        tax = cost * TAX_RATE;
        System.out.println("The tax is: " + currencyFormat.format(tax));
        System.out.println("The total due is: " + currencyFormat.format(tax + cost));

        System.out.println("Your order will be ready for pickup in 30 minutes.");
    }
}
