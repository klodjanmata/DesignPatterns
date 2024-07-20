package DesignPatterns.structural.Bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape greenCircle = new Circle(new GreenColor());

        Shape redSquare = new Square(new RedColor());
        Shape greenSquare = new Square(new GreenColor());

        redCircle.applyColor();
        greenCircle.applyColor();
        redSquare.applyColor();
        greenSquare.applyColor();
    }
}