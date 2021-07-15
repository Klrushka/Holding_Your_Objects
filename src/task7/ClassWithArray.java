package task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassWithArray {
    public void start(){
        ClassWithArray [] classWithArrays = new ClassWithArray[10];

        for (int i = 0; i < 10; i++){
            classWithArrays[i] = new ClassWithArray();
        }

        List<ClassWithArray> list = new ArrayList<>(Arrays.asList(classWithArrays));

        System.out.println("list " + Arrays.toString(list.toArray()));

        List <ClassWithArray> sublist = new ArrayList<>(list.subList(0,2));

        System.out.println("sublist: " + Arrays.toString(sublist.toArray()));

        list.removeAll(sublist);

        System.out.println("list after removeAll() " + Arrays.toString(list.toArray()));

    }

}