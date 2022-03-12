package main.jvm;

/**
 * Java虚拟机—栈帧、操作数栈和局部变量表
 * @author bx
 * @date 8/14/2019 10:37 AM
 * https://zhuanlan.zhihu.com/p/45354152
 */
public class FinallyTest {
    public static int test1(int a) {
        try {
            a += 20;
            return a;
        } finally {
            a += 30;
            return a;
        }
    }

    public static int test2(int b) {
        try {
            b += 20;
            return b;
        } finally {
            b += 30;
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(test1(num));
        System.out.println(test2(num));
    }
}
