package main.jvm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bx
 * @date 8/6/2019 9:43 AM
 */
public class MemoryLeakDemo {
    static class Key {
        Integer id;

        Key(Integer id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }
    }

    public static void main(String[] args) {
        Map map = new HashMap<>(16);
        while (true) {
            for (int i = 0; i < 1000; i++) {
                if (!map.containsKey(new Key(i))) {
                    map.put(new Key(i), "Number:" + i);
                }
            }
        }
    }
}
