package IMP;

import java.util.*;

public class StringBufferTreeSetImp{
    public static void main(String[] args) {
        // Creating a TreeSet with a custom comparator
        TreeSet<Object> treeSet = new TreeSet<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                // Convert both objects to strings for comparison
                String s1 = o1.toString();
                String s2 = o2.toString();
                
                // Compare by length first
                int lengthComparison = Integer.compare(s1.length(), s2.length());
                
                // If lengths are equal, compare alphabetically
                if (lengthComparison == 0) {
                    return s1.compareTo(s2);
                }
                
                return lengthComparison;
            }
        });

        // Adding strings and StringBuffer objects
        String str1 = "A";
        String str2 = "XX";
        String str3 = "ZZZ";
        StringBuffer sb1 = new StringBuffer("ABC");
        StringBuffer sb2 = new StringBuffer("AA");
        StringBuffer sb3 = new StringBuffer("ABCD");
        
        treeSet.add(str1);
        treeSet.add(str2);
        treeSet.add(str3);
        treeSet.add(sb1);
        treeSet.add(sb2);
        treeSet.add(sb3);

        // Printing the TreeSet
        for (Object obj : treeSet) {
            System.out.println(obj);
        }
    }
}
