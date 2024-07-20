package DesignPatterns.structural.Bridge;

public class GreenColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("Green.");
    }
}
