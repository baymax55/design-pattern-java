package main.designpattern.adapterpattern.impl;

import main.designpattern.adapterpattern.AdvancedMediaPlayer;

/**
 * @author bx
 * @date 8/5/2019 9:43 AM
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
