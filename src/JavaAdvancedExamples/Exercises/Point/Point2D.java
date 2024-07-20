package JavaAdvancedExamples.Exercises.Point;

public class Point2D {
    private float x;
    private float y;
    public Point2D(){
        this(0, 0);
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
//        float[] arrayXY = new float[2];
//        arrayXY[0] = this.x;
//        arrayXY[1] = this.y;
//        return arrayXY;
        return new float[]{this.x, this.y};
    }

    public void setXY(float[] values) throws InvalidArrayException{
        if (values.length != 2){
            throw new InvalidArrayException(values.length);
        }
        this.x = values[0];
        this.y = values[1];
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +", " + y +")";
    }
}
