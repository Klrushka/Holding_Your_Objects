package task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence {
    private List<Object> items = new ArrayList<Object>();

    public void add(Object x) {
        items.add(x);
    }

    public Iterator iterator() {
        return items.iterator();
    }


}
