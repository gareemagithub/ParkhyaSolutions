package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListToSet {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(4);

        System.out.println("List is: "+arrayList);

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i:arrayList){
            hashSet.add(i);
        }
        // hashSet.addAll(arrayList);
        System.out.println("Set is: " + hashSet);
    }
}
