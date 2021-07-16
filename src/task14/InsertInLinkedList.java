package task14;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class InsertInLinkedList {
    private List<Integer> numbers = new LinkedList<>();

    public void start(int size) {
        ListIterator<Integer> iterator = numbers.listIterator();
        Random random = new Random();

        for (int i = 0; i < size; i++)
            numbers.add(iterator.previousIndex() / 2, random.nextInt(100));
    }


    public void print() {
        System.out.println(numbers.toString());
    }
}
