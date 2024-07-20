package DesignPatterns.structural.Bridge;

public abstract class Shape {
    // Composition - implementor
    protected Color color;

    // Constructor with implementor as input argument
    protected Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}