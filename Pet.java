public class Pet {
    private String name;
    private String description;

    public Pet() {
        name = "Oreo";
        description = "Black and white tuxedo cat with fluffy fur";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "Pet Information:\nName: " + name + "\nDescription: " + description;
    }

    public static void main(String[] args) {
        Pet pet = new Pet();
        System.out.println(pet);
    }
}

