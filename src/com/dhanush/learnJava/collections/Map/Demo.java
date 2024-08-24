package src.com.dhanush.learnJava.collections.Map;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Map<String, Integer> map = Map.of("A",2,"B",3,"C",4,"D",5);
        /*
            you can insert the elements in 2 ways.
                1st method insert the elements to the map by using .of() method
                and then insert the map object to the hashMap as an argument
                2nd method is directly insert the elements to hashMap by
                .of() inside the argument, refer Queue for example
         */

        //HashMap
        Map<String, Integer> hashMap = new HashMap<>(map);
        System.out.println(hashMap);
        System.out.println(hashMap.get("A"));
        hashMap.put("E",6);
        System.out.println(hashMap);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        hashMap.clear();

        //HashTable
        Map<String, Integer> hashTable = new Hashtable<>(map);
        System.out.println("hashTable --> "+hashTable);

        //LinkedHashMap
        Map<String, Integer> linkedhashMap = new LinkedHashMap<>(map);
        System.out.println("LinkedHashMap --> "+linkedhashMap);
        linkedhashMap.put("Z", 20);
        System.out.println("LinkedHashMap --> "+linkedhashMap);

        //TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println(STR."TreeMap --> \{treeMap}");
        treeMap.put("Y",10);
        System.out.println(STR."TreeMap --> \{treeMap}");

    }
}
