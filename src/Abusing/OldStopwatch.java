package Abusing;

public class OldStopwatch {
    private boolean running = false;

    public void click(){
        this.running = !this.running;
        if (this.running){
            System.out.println("Stopwatch RUNNING!");
        }
        else{
            System.out.println("Stopwatch STOPPED!");
        }
    }
    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
