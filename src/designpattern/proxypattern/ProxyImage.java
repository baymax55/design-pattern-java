package designpattern.proxypattern;

import designpattern.proxypattern.impl.RealImage;

/**
 * @author bx
 * @date 8/10/2019 11:42 PM
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage==null){
           realImage= new RealImage(fileName);
        }
        realImage.display();
    }
}
