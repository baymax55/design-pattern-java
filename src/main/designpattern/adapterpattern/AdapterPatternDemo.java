package main.designpattern.adapterpattern;

import main.designpattern.adapterpattern.impl.AudioPlayer;

/**
 * @author bx
 * @date 8/5/2019 9:56 AM
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "alone.vlc");
        audioPlayer.play("avi", "alone.avi");
    }
}
