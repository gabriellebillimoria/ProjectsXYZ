import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // Instantiate a Calc object
        Calc myCalculator = new Calc();

        // Get user input for two numbers safely
        Scanner scan = new Scanner(System.in);
        double n1 = getValidNumber(scan, "Enter the first number: ");
        double n2 = getValidNumber(scan, "Enter the second number: ");

        // Pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // Display the numbers entered
        System.out.println("You entered: " + myCalculator.getNum1() + " and " + myCalculator.getNum2());

        // Perform calculations and display results
        System.out.println("Addition result: " + myCalculator.add());
        System.out.println("Subtraction result: " + myCalculator.subtract());
        System.out.println("Multiplication result: " + myCalculator.multiply());

        try {
            System.out.println("Division result: " + myCalculator.divide());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to ensure valid numeric input
    private static double getValidNumber(Scanner scan, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextDouble()) {
                number = scan.nextDouble();
                scan.nextLine(); // Consume newline character
                return number;
            } else {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scan.nextLine(); // Clear invalid input
            }
        }
    }
}
