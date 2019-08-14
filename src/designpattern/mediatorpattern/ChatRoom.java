package designpattern.mediatorpattern;

import java.util.Date;

/**
 * @author bx
 * @date 8/14/2019 9:27 AM
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
