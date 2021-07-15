package task5;

import java.util.*;

public class ListFeatures {
    public void start() {
        Random rand = new Random(47);
        Collection col = new ArrayList(Arrays.asList(26, 27, 28, 29));
        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        System.out.println("1: " + numbers);
        Integer i = 21;
        numbers.add(5); // Automatically resizes
        System.out.println("2: " + numbers);
        System.out.println("3: " + numbers.contains(i));
        numbers.remove(i); // Remove by object
        Integer i1 = numbers.get(2);
        System.out.println("4: " + i1 + " " + numbers.indexOf(i1));
        Integer i2 = 22;
        System.out.println("5: " + numbers.indexOf(i2));
        System.out.println("6: " + numbers.remove(i2));
        // Must be the exact object:
        System.out.println("7: " + numbers.remove(i1));
        System.out.println("8: " + numbers);
        numbers.add(3, 23); // Insert at an index
        System.out.println("9: " + numbers);
        List<Integer> sub = numbers.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + numbers.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
// Order is not important in containsAll():
        System.out.println("11: " + numbers.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + numbers.containsAll(sub));
        List<Integer> copy = new ArrayList<Integer>(numbers);
        sub = Arrays.asList(numbers.get(1), numbers.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(numbers); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, 24); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + numbers.isEmpty());
        numbers.clear(); // Remove all elements
        System.out.println("19: " + numbers);
        System.out.println("20: " + numbers.isEmpty());
        numbers.addAll(col);
        System.out.println("21: " + numbers);
        Object[] o = numbers.toArray();
        System.out.println("22: " + o[3]);
        Integer[] ia = numbers.toArray(new Integer[0]);
        System.out.println("23: " + ia[3]);
    }
}
