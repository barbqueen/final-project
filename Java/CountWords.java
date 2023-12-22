package Java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Word count: " + wordCount);
        scanner.close();
    }

    private static int countWords(String input) {
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
