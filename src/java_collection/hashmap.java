package java_collection;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);
        System.out.println(map);
        map.put(2, map.get(2) + 1);
        System.out.println(map.get(2));
    }
}
