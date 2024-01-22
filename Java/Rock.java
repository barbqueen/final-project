package Java;
import java.util.Scanner;

public class Rock {
    public static void main(String[] args) {
        String personPlay; // User's play -- "R", "P", or "S"
        String computerPlay = ""; // Computer's play -- "R", "P", or "S"
        int computerInt; // Randomly generated number for computer play

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your play: R, P, or S");
        personPlay = scan.nextLine().toUpperCase(); // Get player's play and convert to uppercase

        // Generate computer's play (0, 1, 2)
        computerInt = (int) (Math.random() * 3); // Randomly generates 0, 1, or 2

        // Translate computer's randomly generated play to string using if statements
        if (computerInt == 0)
            computerPlay = "R";
        else if (computerInt == 1)
            computerPlay = "P";
        else if (computerInt == 2)
            computerPlay = "S";

        System.out.println("Computer play is: " + computerPlay);

        // Determine winner using nested if statements
        if (personPlay.equals(computerPlay)) 
        {
            System.out.println("It's a tie!");
        } 
        else if (personPlay.equals("R")) 
        {
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else if (computerPlay.equals("P"))
                System.out.println("Paper eats rock. You lose!!");
        } 
        else if (personPlay.equals("P")) 
        {
            if (computerPlay.equals("R"))
                System.out.println("Paper eats rock. You win!!");
            else if (computerPlay.equals("S"))
                System.out.println("Scissors cuts paper. You lose!!");
        } 
        else if (personPlay.equals("S")) 
        {
            if (computerPlay.equals("P"))
                System.out.println("Scissors cuts paper. You win!!");
            else if (computerPlay.equals("R"))
                System.out.println("Rock crushes scissors. You lose!!");
        } 
        else 
        {
            System.out.println("Invalid user input.");
        }
    }
}
