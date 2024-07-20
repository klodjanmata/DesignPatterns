package DesignPatterns.behavioral.State;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new Selection());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new Eraser());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
