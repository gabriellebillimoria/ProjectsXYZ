import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        // Create an ArrayList for Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Create an ArrayList for Integers
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);

        // Display the contents of the String ArrayList using different methods
        System.out.println("Contents of String ArrayList:");

        // Basic for loop
        for (String s : stringList) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Enhanced for loop
        System.out.print("Enhanced for loop: ");
        for (String fruit : stringList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // forEach method
        System.out.print("forEach method: ");
        stringList.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println("\n");

        // Display the contents of the Integer ArrayList using different methods
        System.out.println("Contents of Integer ArrayList:");

        // Basic for loop
        for (Integer integer : integerList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        // Enhanced for loop
        System.out.print("Enhanced for loop: ");
        for (Integer number : integerList) {
            System.out.print(number + " ");
        }
        System.out.println();

        // forEach method
        System.out.print("forEach method: ");
        integerList.forEach(number -> System.out.print(number + " "));
        System.out.println("\n");

        // Perform two additional operations on the String ArrayList
        stringList.remove("Banana"); // Remove an item
        stringList.add(1, "Blueberry"); // Add an item at a specific index

        // Perform two additional operations on the Integer ArrayList
        integerList.set(2, 35); // Change the value at index 2
        integerList.removeFirst(); // Remove the first item

        // Display the updated contents of the String ArrayList
        System.out.println("Updated String ArrayList:");
        stringList.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println();

        // Display the updated contents of the Integer ArrayList
        System.out.println("Updated Integer ArrayList:");
        integerList.forEach(number -> System.out.print(number + " "));
        System.out.println();
    }
}