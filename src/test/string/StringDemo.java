package test.string;


import static java.lang.System.out;

/**
 * @author bx
 * @date 8/6/2019 4:09 PM
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = new String("1") + new String("1");
        s.intern();
        String s1 = "11";
        out.println(s == s1);

    }

}
