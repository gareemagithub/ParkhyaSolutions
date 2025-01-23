package Collections;

import java.util.*;

public class MapToSet {
    public static void main(String[] args) {
        Map<Integer,String> mapObj= new HashMap<>();
        mapObj.put(1,"abc");
        mapObj.put(2,"def");
        mapObj.put(3,"ghi");
        mapObj.put(4,"jkl");
        mapObj.put(5,"mno");

        System.out.println("Map is: "+mapObj);

        Set<Map.Entry<Integer, String>> entriesSet = mapObj.entrySet();
        System.out.println("Set is: "+entriesSet); 

        Set<String> valuesSet = new HashSet<>(mapObj.values());
        System.out.println(valuesSet); 

        Set<Integer> keysSet = mapObj.keySet();
        System.out.println(keysSet);  
    }
}
