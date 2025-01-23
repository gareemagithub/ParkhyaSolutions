package Collections;

import java.util.*;

public class SetToList {
    public static void main(String[] args) {
        Set<Integer> setObj= new HashSet<>();
        setObj.add(1);
        setObj.add(2);
        setObj.add(3);
        setObj.add(4);
        setObj.add(5);
        setObj.add(5);
        setObj.add(6);
 
        List<Integer> listObj= new ArrayList<>();
        // for(int i:setObj){
        //     listObj.add(i);
        // }
        listObj.addAll(setObj);
        System.out.println(listObj);
    }
}
