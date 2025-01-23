package Collections;

import java.util.*;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer,Integer> mapObj= new HashMap<>();
        mapObj.put(1, 3);
        mapObj.put(2, 6);
        mapObj.put(3, 9);
        mapObj.put(4, 12);
        mapObj.put(5, 15);
        mapObj.put(6, 18);
        mapObj.put(7, 21);
        mapObj.put(8, 24);

        System.out.println("Map is: "+mapObj);

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(mapObj.entrySet());
        System.out.println("list to map is: "+entryList);
    }
}