package iteratorpattern;

import iteratorpattern.impl.NameRepository;

/**
 * @author bx
 * @date 8/13/2019 10:09 AM
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
