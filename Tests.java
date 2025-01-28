class Tests {
    public static void main(String[] args) {
        // Test scores
        double[] testScores = {86.2, 79.9, 87.6};

        // Calculate the average
        double total = 0;
        for (double score : testScores) {
            total += score;
        }
        double average = total / testScores.length;

        // Display test scores and average
        for (int i = 0; i < testScores.length; i++) {
            System.out.println("Test score " + (i + 1) + ": " + testScores[i]);
        }
        System.out.printf("The average of 3 test scores is: %.2f%n", average);
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> i