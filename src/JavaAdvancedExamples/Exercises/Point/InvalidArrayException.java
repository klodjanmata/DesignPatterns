package JavaAdvancedExamples.Exercises.Point;

public class InvalidArrayException extends RuntimeException{

    public InvalidArrayException(int arrayLength){
        super("InvalidArrayException, provided length " + arrayLength + " invalid for required 2");
    }
}
