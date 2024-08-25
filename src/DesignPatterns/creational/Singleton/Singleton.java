package DesignPatterns.creational.Singleton;


public class Singleton {

    private static Singleton instance;
    private int value = 0;

    private Singleton() {
    }

    public static Singleton getInstance(int value) {
        if (instance == null) {
            instance = new Singleton();
            value = value;
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a Singleton instance! " + value);
    }

    public static void main(String[] args) {
        // Getting the single instance of the Singleton class
        Singleton singletonInstance = Singleton.getInstance(0);

        // Calling a method on the Singleton instance
        singletonInstance.showMessage();

        singletonInstance = Singleton.getInstance(1);
        singletonInstance.showMessage();
    }
}
