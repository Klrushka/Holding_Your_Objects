import task3.Selector;
import task3.Sequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Exercise 3: (2) Modify innerclasses/Sequence.java so that you can add any number
        of elements to it.
         */

        Sequence sequence = new Sequence();
        for (int i = 0; i < 15; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();

        selector.getObjects();


        /*

         */


    }
}
