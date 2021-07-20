import task11.ClassWithIterator;
import task14.InsertInLinkedList;
import task16.UniqueWords;
import task18.ClassWithHashMap;
import task21.SortMap;
import task3.Selector;
import task3.Sequence;
import task5.ListFeatures;
import task7.ClassWithArray;

import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        System.out.println();

        /*
        Exercise 11: (2) Write a method that uses an Iterator to step through a Collection and
        print the toString( ) of each object in the container. Fill all the different types of
        Collections with objects and apply your method to each container.
         */

        Collection<Integer> integerCollection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collection<Character> characterCollection = new HashSet<>(Arrays.asList('a', 'a', 'v', 'd', 'o'));

        ClassWithIterator.print(integerCollection);

        System.out.println();

        ClassWithIterator.print(characterCollection);

        System.out.println();

        /*
        Exercise 14: (3) Create an empty LinkedList<Integer>. Using a ListIterator, add
        Integers to the List by always inserting them in the middle of the List.
         */

        InsertInLinkedList insertInLinkedList = new InsertInLinkedList();

        insertInLinkedList.start(20);

        insertInLinkedList.print();

        System.out.println();

        /*
        Exercise 16: (5) Create a Set of the vowels. Working from UniqueWords.Java, count
        and display the number of vowels in each input word, and also display the total number of
        vowels in the input file
         */


        UniqueWords uniqueWords = new UniqueWords();


        uniqueWords.countVowels(uniqueWords.readFile());


        System.out.println();

        /*
        Exercise 18: (3) Fill a HashMap with key-value pairs. Print the results to show
        ordering by hash code. Extract the pairs, sort by key, and place the result into a
        LinkedHashMap. Show that the insertion order is maintained.
         */

        ClassWithHashMap classWithHashMap = new ClassWithHashMap();

        classWithHashMap.init();

        System.out.println(classWithHashMap.sort());

        System.out.println();

        /*
        Exercise 21: (3) Using a Map<String,Integer>, follow the form of
        UniqueWords.java to create a program that counts the occurrence of words in a file. Sort
        the results using Collections.sort( ) with a second argument of
        String.CASE_INSENSITIVE_ORDER (to produce an alphabetic sort), and display the
        result.
         */

        SortMap sortMap = new SortMap();

        sortMap.start();



        // test
        System.out.println("*****************************************************************************************");

        Pattern pattern = Pattern.compile(".*[aeiouAEIOU]*.");
        MatchResult matcher = pattern.matcher("Hi my names is Kirill");


        System.out.println(matcher.groupCount());






    }
}
