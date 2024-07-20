package DesignPatterns.creational.AbstractFactoryExample;

public class Main {
    public static void main(String[] args) {
        Style s = new Vicorian();
        Chair victorianChair = new Chair();
        victorianChair.create(s);

    }
}
