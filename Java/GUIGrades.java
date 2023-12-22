package Java;
public class GUIGrades {
    // Instance fields
    private String origLetter;
    private double newNumeric;

    private double origNumeric;
    private String newLetter;

    // Default constructor
    public GUIGrades() {
        origLetter = "";
        origNumeric = 0;
        newLetter = "";
        newNumeric = 0;
    }

    // Parametric constructor
    public GUIGrades(String oldLetter, double oldNumeric) {
        origLetter = oldLetter;
        origNumeric = oldNumeric;

        setNewNumeric();
        setNewLetter();
    }

    // Mutator method for new numeric grade
    private void setNewNumeric() {
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
        } else {
            newNumeric = 0.0; // Default case for invalid grades
        }
    }

    // Mutator method for new letter grade
    private void setNewLetter() {
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
    }

    // Accessor method for new numeric grade
    public double getNewNumeric() {
        return newNumeric;
    }

    // Accessor method for new letter grade
    public String getNewLetter() {
        return newLetter;
    }
}