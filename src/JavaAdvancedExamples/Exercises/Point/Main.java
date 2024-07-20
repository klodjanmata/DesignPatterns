package JavaAdvancedExamples.Exercises.Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D pointA = new Point2D();
        Point2D pointB = new Point2D(4, 5);
        System.out.println("A : " + pointA.toString() + " \nB : " + pointB.toString());

        System.out.println(Arrays.toString(pointB.getXY()));
        float[] test = new float[]{1, 2, 3};
        try {
            pointA.setXY(test);
        }catch (InvalidArrayException e){
            e.printStackTrace();
        }
    }
}
