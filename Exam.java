import javax.swing.JOptionPane;

public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    public Exam() {
        boolean validInput = false;

        while (!validInput) {
            try {
                String questionsStr = JOptionPane.showInputDialog("Enter the number of questions on the exam:");
                String missedStr = JOptionPane.showInputDialog("Enter the number of questions missed:");

                // Convert inputs to integers
                int questions = Integer.parseInt(questionsStr);
                int missed = Integer.parseInt(missedStr);

                // Check for division by zero
                if (questions <= 0) {
                    throw new ArithmeticException("Number of questions must be greater than zero.");
                }

                if (missed < 0 || missed > questions) {
                    throw new IllegalArgumentException("Number of missed questions must be between 0 and the total number of questions.");
                }

                this.numQuestions = questions;
                this.numMissed = missed;

                // Calculate the points each question is worth
                this.pointsEach = 100.0 / questions;

                // Calculate the score
                int score = (int) Math.round(100 - (missed * pointsEach));
                setScore(score);

                validInput = true; // Valid input received, exit loop

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter whole numbers only.");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Input error: " + e.getMessage());
            }
        }
    }

    public Exam(int questions, int missed) {
        super();
    }

    public double getPointsEach() {
        return this.pointsEach;
    }
}
