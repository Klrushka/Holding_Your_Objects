package task11;

import java.util.Collection;
import java.util.Iterator;

public class ClassWithIterator {
    public static void print(Collection co){
        Iterator iterator = co.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
