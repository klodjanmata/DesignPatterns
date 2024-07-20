package DesignPatterns.creational.AbstractFactoryExample;

public class Chair implements Factory{


    @Override
    public void create(Style s) {
        if (s.getClass().equals(Vicorian.class)){
            System.out.println("Chair is Vicorian style");
        }
        else if (s.getClass().equals(ArtDeco.class)){
            System.out.println("Chair is ArtDeco style");
        }
    }
}
