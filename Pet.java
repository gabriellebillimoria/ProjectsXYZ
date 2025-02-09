public class Pet {
    // Private field to store the pet's name
    private String name;

    // constructor
    public Pet() {
        this.name = "Oreo"; // Default name for the pet
    }

    // Method to provide pet's name
    public void setName(String name) {
        this.name = name;
    }

    // Method to  provide  pet's name
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
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // Creating another pet and setting a custom name
        Pet pet2 = new Pet();
        pet2.setName("Rex");
        System.out.println(pet2);
    }
}

