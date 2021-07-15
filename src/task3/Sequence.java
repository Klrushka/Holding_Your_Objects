package task3;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
    private List<Object> items = new ArrayList();
    private int next = 0;


    public void add(Object x) {
            next++;
            items.add(x);
    }

    private class SequenceSelector implements Selector {

        @Override
        public void getObjects(){
            for(Object o : items){
                System.out.println(o.toString());
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}
