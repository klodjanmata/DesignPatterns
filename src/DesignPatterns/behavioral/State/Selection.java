package DesignPatterns.behavioral.State;

public class Selection implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Rectangle Selected");
    }
}
