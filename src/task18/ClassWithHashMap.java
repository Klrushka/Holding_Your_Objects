package task18;

import java.util.*;

public class ClassWithHashMap {

    private Map<String, Integer> map = new HashMap<>();

    private Map<String, Integer> lMap = new LinkedHashMap<>();

    private Set<String> tSet;




    public void init() {
        Random random = new Random();

        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);

        tSet = new TreeSet<>(map.keySet());
    }




    public Map<String, Integer> sort (){

        for (String i : tSet){
            lMap.put(i,map.get(i));
        }

        return lMap;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public Map<String, Integer> getlMap() {
        return lMap;
    }

    public Set<String> gettSet() {
        return tSet;
    }
}
