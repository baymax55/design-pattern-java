package designpattern.adapterpattern.impl;

import designpattern.adapterpattern.MediaPlayer;

/**
 * @author bx
 * @date 8/5/2019 9:47 AM
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("playing mp3 file" + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        } else {
            System.out.println("invalid media");
        }
    }
}
