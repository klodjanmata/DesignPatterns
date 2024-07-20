package DesignPatterns.creational.AbstractFactoryExample;

public class Table implements Factory{
    @Override
    public void create(Style s) {
        if (s.getClass().equals(Vicorian.class)){
            System.out.println("Table is Vicorian style");
        }
        else if (s.getClass().equals(ArtDeco.class)){
            System.out.println("Table is ArtDeco style");
        }
    }
}
