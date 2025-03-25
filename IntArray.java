import java.util.Random;
import java.util.Arrays;

public class IntArray {
    // Private data fields
    private int length;
    private int[] myArray;

    // Constructor to initialize the array with a given size
    public IntArray(int size) {
        this.length = size;
        this.myArray = new int[size];
    }

    // Method to return the size of the array
    public int size() {
        return this.length;
    }

    // Method to fill the array with random integers between 1 and 6
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1; // Generates numbers from 1 to 6
        }
    }

    // Method to set a value at a specific index
    public void set(int index, int value) {
        if (index >= 0 && index < length) {
            myArray[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + length);
        }
    }

    // Method to get a value at a specific index
    public int get(int index) {
        if (index >= 0 && index < length) {
            return myArray[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + length);
        }
    }

    // Method to clear the array (set all elements to 0)
    public void clear() {
        Arrays.fill(myArray, 0);
    }

    // Method to check if the array is empty (all elements are 0)
    public boolean isEmpty() {
        for (int value : myArray) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    // Method to sort the array
    public void sort() {
        Arrays.sort(myArray);
    }

    // Override toString() method to provide a meaningful representation of the array
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}