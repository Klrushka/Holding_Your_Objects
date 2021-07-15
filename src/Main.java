import task3.Selector;
import task3.Sequence;
import task5.ListFeatures;
import task7.ClassWithArray;

import java.util.*;

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

        System.out.println();

        /*
        Exercise 5: (3) Modify ListFeatures.java so that it uses Integers (remember
        autoboxing!) instead of Pets, and explain any difference in results.
         */


        ListFeatures listFeatures = new ListFeatures();

        listFeatures.start();

        System.out.println();

        /*
        Exercise 7: (3) Create a class, then make an initialized array of objects of your class. Fill
        a List from your array. Create a subset of your List by using subList( ), then remove this
        subset from your List.
         */


        ClassWithArray classWithArray = new ClassWithArray();

        classWithArray.start();

        System.out.println()
        ;
        /*
        Exercise 9: (4) Modify innerclasses/Sequence.java so that Sequence works with an
        Iterator instead of a Selector.
         */

        task9.Sequence sequence1 = new task9.Sequence();
        for (int i = 0; i < 10; i++)
            sequence1.add(Integer.toString(i));

        Iterator it = sequence1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

        /*

         */






    }
}
