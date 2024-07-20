package Abusing;

public class Running implements State{
    @Override
    public void click(Stopwatch s) {
        System.out.println("Stopwatch RUNNING!");
    }
}
