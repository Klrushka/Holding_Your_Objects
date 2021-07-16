package task18;

import java.util.*;

public class ClassWithHashMap {

    private Map<Integer, Integer> map = new HashMap<>();

    private Map<Integer, Integer> lMap = new LinkedHashMap<>();

    private Set<Integer> tSet;


    public void init() {
        Random random = new Random();

        for (int i = 0; i < 10; i++){
            map.put(i,random.nextInt(20));
        }

        tSet = new TreeSet<>(map.keySet());
    }



    public Map<Integer, Integer> sort (){

        for (Integer i : tSet){
            lMap.put(i,map.get(i));
        }

        return lMap;
    }

}
