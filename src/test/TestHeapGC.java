package test;

/**
 * @author bx
 * @date 8/7/2019 1:50 PM
 */
public class TestHeapGC {
    public static void main(String[] args) {
//        HeapGC();
    }

    private static void HeapGC() {
        byte[] bytes=new byte[1024*1024/2];
        byte[] bytes2=new byte[1024*1024*8];
        bytes2=null;
        bytes2=new byte[1024*1024*8];
        System.gc();
    }
}
