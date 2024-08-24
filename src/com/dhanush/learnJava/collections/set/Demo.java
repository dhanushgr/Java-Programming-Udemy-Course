package src.com.dhanush.learnJava.collections.set;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = Set.of("Apple","Banana","Cat");
        System.out.println(set);

        Set<String> hashSet = new HashSet<>(set);
        hashSet.add("Dog");
        hashSet.add("Apple"); //It doesnot add this element because it is already present in there.
        System.out.println(hashSet);
        hashSet.remove("Cat");
        System.out.println(hashSet);


        Set<String> treeSet = new TreeSet<>(set);
        treeSet.add("Dog");
        System.out.println(treeSet);
        treeSet.remove("Banana");
        System.out.println(treeSet);

        //below sets are dealing with Integers
        Set<Integer> integers = Set.of(1234, 123, 12, 1);

        Set<Integer> integersHashSet = new HashSet<>(integers);
        System.out.println("integersHashSet --> "+integersHashSet); //will be in random order

        Set<Integer> integerTreeSet = new TreeSet<>(integers);
        System.out.println("integerTreeSet --> "+integerTreeSet); //will be in sorted order

        Set<Integer> integerLinkedHashSet = new LinkedHashSet<>(integers);
        System.out.println("integerLinkedHashSet --> "+integerLinkedHashSet);//here, i have not inserted anything by myself(no manual insertion), so it will be random.
        integerLinkedHashSet.add(23);   //manual insertion
        System.out.println("integerLinkedHashSet --> "+integerLinkedHashSet); //will be in insertion order
    }
}
