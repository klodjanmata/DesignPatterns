package DesignPatterns.structural.Adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Playing audio using AudioPlayer
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // Using the MediaAdapter to play other file formats
        else if(audioType.equalsIgnoreCase("vlc") ||
                audioType.equalsIgnoreCase("mp4") ||
                audioType.equalsIgnoreCase("avi")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
