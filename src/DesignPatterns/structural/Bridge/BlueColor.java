package DesignPatterns.structural.Bridge;

public class BlueColor implements Color{

    @Override
    public void applyColor() {
        System.out.println("Blue.");
    }
}
