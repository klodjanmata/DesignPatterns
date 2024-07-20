package DesignPatterns.behavioral.Command;

public class CommandPatternDemo {

    public static void main(String[] args) {
        // Create receiver objects
        Light livingRoomLight = new Light();
        GarageDoor garageDoor = new GarageDoor();

        // Create command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command garageOpen = new GarageDoorOpenCommand(garageDoor);
        Command garageClose = new GarageDoorCloseCommand(garageDoor);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Execute commands
        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(lightOff);
        remote.pressButton();

        remote.setCommand(garageOpen);
        remote.pressButton();

        remote.setCommand(garageClose);
        remote.pressButton();
    }
}
