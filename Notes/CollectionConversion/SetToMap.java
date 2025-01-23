package Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetToMap {
    public static void main(String[] args) {
        Set<String> namesSet = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));

        Map<String, Integer> namesMap = new HashMap<>();
        // namesSet.forEach(name -> namesMap.put(name, name.length()));

         for (String str : namesSet) {
            namesMap.put(str, str.length());
        }

        System.out.println(namesMap); 
    }
}
