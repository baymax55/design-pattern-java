package designpattern.compositeEntityPattern;

/**
 * @author bx
 * @date 9/18/2019 2:42 PM
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
