package mediatorpattern;

/**
 * @author bx
 * @date 8/14/2019 9:28 AM
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
