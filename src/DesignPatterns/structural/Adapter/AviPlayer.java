package DesignPatterns.structural.Adapter;

public class AviPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing AVi file. Name: " + fileName);
    }
}
