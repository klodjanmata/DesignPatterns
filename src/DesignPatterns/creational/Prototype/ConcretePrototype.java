package DesignPatterns.creational.Prototype;

public class ConcretePrototype implements Prototype {
    private String name;

    // Constructor
    public ConcretePrototype(String name) {
        this.name = name;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Implement the clone method
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Shouldn't happen since we're Cloneable
        }
    }

    // Method to display object information
    public void displayInfo() {
        System.out.println("Prototype Name: " + name);
    }

    public static void main(String[] args) {
        // Create an original object
        ConcretePrototype original = new ConcretePrototype("Original");

        // Clone the original object
        ConcretePrototype clone = (ConcretePrototype) original.clone();
        clone.setName("Clone");

        // Display information about both objects
        original.displayInfo();  // Output: Prototype Name: Original
        clone.displayInfo();     // Output: Prototype Name: Clone
    }
}
