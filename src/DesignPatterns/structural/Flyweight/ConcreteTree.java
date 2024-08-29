package DesignPatterns.structural.Flyweight;

public class ConcreteTree implements Tree {
    private String type;
    private String texture;

    public ConcreteTree(String type, String texture) {
        this.type = type;
        this.texture = texture;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying a " + type + " tree with texture " + texture + " at (" + x + ", " + y + ")");
    }
}

