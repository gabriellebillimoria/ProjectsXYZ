/**
 A class that represents an Exam, inheriting from Assessment.
 */
public class Exam extends Assessment {
    private int numQuestions;  // Number of questions
    private int numMissed;     // Number of questions missed
    private double pointsEach; // Points for each question

    /**
     Constructor that initializes the Exam object.
     @param questions The total number of questions on the exam.
     @param missed The number of questions missed by the student.
     */
    public Exam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;

        // Calculate the points for each question
        this.pointsEach = 100.0 / questions;

        // Calculate the score
        int score = (int) Math.round(100 - (missed * pointsEach));

        // Set the score using the inherited method
        setScore(score);
    }

    /**
     Gets the points each question is worth.
     @return The points per question.
     */
    public double getPointsEach() {
        return this.pointsEach;
    }
}
