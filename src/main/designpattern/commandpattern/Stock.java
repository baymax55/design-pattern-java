package main.designpattern.commandpattern;

/**
 * @author bx
 * @date 8/12/2019 4:27 PM
 */
public class Stock {
    private String name="ABC";
    private int quantity=10;

    public void buy(){
        System.out.println(" Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }
    public void sell(){
        System.out.println(" Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}
