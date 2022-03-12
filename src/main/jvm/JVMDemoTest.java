package main.jvm;

/**
 * @author bx
 * @date 8/5/2019 5:51 PM
 */
public class JVMDemoTest {
    /**
     * 获取当前jvm的内存信息
     * -Xms64m -Xmx256m
     *
     * @return
     */
    public static String toMemoryInfo() {
        Runtime runtime = Runtime.getRuntime();
        int freeMemory = (int) runtime.freeMemory() / 1024 / 1024;
        int totalMemory = (int) runtime.totalMemory() / 1024 / 1024;
        return freeMemory + "M/" + totalMemory + "M(free/total)";
    }

    public static void main(String[] args) {
        System.out.println("memory info :" + toMemoryInfo());
    }
}
