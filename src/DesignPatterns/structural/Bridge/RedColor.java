package DesignPatterns.structural.Bridge;

public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("Red.");
    }
}
