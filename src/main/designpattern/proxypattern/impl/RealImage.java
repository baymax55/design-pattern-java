package main.designpattern.proxypattern.impl;

import main.designpattern.proxypattern.Image;

/**
 * @author bx
 * @date 8/10/2019 11:39 PM
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Diplaying" + fileName);
    }
}
