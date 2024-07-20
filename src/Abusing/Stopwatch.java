package Abusing;

public class Stopwatch {

    private State stopwatchState = new Stoped();

    public void click(){
        changeState();
        stopwatchState.click(this);
    }

    public void changeState(){
        if (this.stopwatchState.getClass() == Running.class){
            this.stopwatchState = new Stoped();
        }
        else{
            this.stopwatchState = new Running();
        }
    }

    public State getStopwatchState() {
        return stopwatchState;
    }

    public void setStopwatchState(State stopwatchState) {
        this.stopwatchState = stopwatchState;
    }
}
