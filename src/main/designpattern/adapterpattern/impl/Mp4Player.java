package main.designpattern.adapterpattern.impl;

import main.designpattern.adapterpattern.AdvancedMediaPlayer;

/**
 * @author bx
 * @date 8/5/2019 9:44 AM
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4 file" + fileName);
    }
}
