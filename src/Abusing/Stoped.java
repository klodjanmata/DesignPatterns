package Abusing;

public class Stoped implements State{
    @Override
    public void click(Stopwatch s) {
        System.out.println("Stopwatch STOPPED!");
    }
}
