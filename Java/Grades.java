package Java;
import javax.swing.JOptionPane;

public class Grades {
    public static void main(String[] args) {
        String origLetter = JOptionPane.showInputDialog("Please enter Letter Grade:");
        String origNumericStr = JOptionPane.showInputDialog("Please enter Numeric Grade:");
        double origNumeric = Double.parseDouble(origNumericStr);

        // Convert letter grade to numeric grade
        double newNumeric = 0.0;
        if (origLetter.equalsIgnoreCase("A")) {
            newNumeric = 4.0;
        } else if (origLetter.equalsIgnoreCase("B")) {
            newNumeric = 3.0;
        } else if (origLetter.equalsIgnoreCase("C")) {
            newNumeric = 2.0;
        } else if (origLetter.equalsIgnoreCase("D")) {
            newNumeric = 1.0;
        } else if (origLetter.equalsIgnoreCase("F")) {
            newNumeric = 0.0;
        }

        // Convert numeric grade to letter grade
        String newLetter = "";
        if (origNumeric >= 3.85) {
            newLetter = "A";
        } else if (origNumeric >= 3.0) {
            newLetter = "B";
        } else if (origNumeric >= 2.0) {
            newLetter = "C";
        } else if (origNumeric >= 1.0) {
            newLetter = "D";
        } else {
            newLetter = "F";
        }