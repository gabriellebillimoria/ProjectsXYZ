import java.io.*;
import java.text.DecimalFormat;

public class lab8 {

    public static void main(String[] args) {
        String inputFile = "pay.csv";
        String outputFile = "output.csv";
        String line;
        DecimalFormat df = new DecimalFormat("$#,##0.00");

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            // Write header to output file
            bw.write("EmpID,Rate,Hours,Weekly Pay");
            bw.newLine();

            // Skip header line in input file
            br.readLine();

            // Process each line from input file
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                String empId = parts[0];
                double rate = Double.parseDouble(parts[1]);
                double hours = Double.parseDouble(parts[2]);

                double weeklyPay;
                if (hours > 40) {
                    double overtimeHours = hours - 40;
                    weeklyPay = (rate * 40) + (overtimeHours * rate * 1.5);
                } else {
                    weeklyPay = rate * hours;
                }

                String formattedPay = df.format(weeklyPay);

                bw.write(empId + "," + rate + "," + hours + "," + formattedPay);
                bw.newLine();
            }

            System.out.println("Payroll processing complete. Check output.csv for results.");

        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number from CSV file: " + e.getMessage());
        }
    }
}
