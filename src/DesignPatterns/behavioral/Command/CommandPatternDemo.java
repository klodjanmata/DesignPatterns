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

git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/klodjanmata/DesignPatterns.git
git push -u origin main