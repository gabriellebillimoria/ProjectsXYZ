public class pet {
    // Private field to store the pet's name
    private String name;

    // Default constructor that sets a default name
    public pet() {
        this.name = "Oreo"; // Default name for the pet
    }

    // Method to update the pet's name
    public void setName(String name) {
        this.name = name;
    }

    // Method to retrieve the pet's name
    public String getName() {
        return name;
    }

    // Method to return pet details as a string
    @Override
    public String toString() {
        return "Pet Information:\nName: " + name + "\n";
    }

    // Main method to demonstrate how the Pet class works
    public static void main(String[] args) {
        // Creating a pet using the default constructor
        pet pet1 = new pet();
        System.out.println(pet1);

        // Creating another pet and setting a custom name
        pet pet2 = new pet();
        pet2.setName("Rex");
        System.out.println(pet2);
    }
}

