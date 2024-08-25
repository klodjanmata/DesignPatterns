package DesignPatterns.structural.Adapter;

public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
    void playAvi(String fileName);
}
