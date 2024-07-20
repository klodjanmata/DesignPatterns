package DesignPatterns.creational.Singleton;


public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a Singleton instance!");
    }

    public static void main(String[] args) {
        // Getting the single instance of the Singleton class
        Singleton singletonInstance = Singleton.getInstance();

        // Calling a method on the Singleton instance
        singletonInstance.showMessage();
    }
}
