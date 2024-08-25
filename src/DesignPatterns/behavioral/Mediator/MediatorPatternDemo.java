package DesignPatterns.behavioral.Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ConcreteUser(mediator, "Alice");
        User user2 = new ConcreteUser(mediator, "Bob");
        User user3 = new ConcreteUser(mediator, "Charlie");
        User user4 = new ConcreteUser(mediator, "Diana");
        User user5 = new ConcreteUser(mediator, "Sinan");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Hi everyone!");
        user5.send("Hello!");
    }
}
