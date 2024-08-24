package src.com.dhanush.learnJava.collections.set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Characters {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        System.out.println(characters);

        Set<Character> characterLinkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("Insertion order priority --> "+characterLinkedHashSet);

        Set<Character> characterTreeSet = new TreeSet<>(characters);
        System.out.println("Sorted order priority --> "+characterTreeSet);


        TreeSet<Integer> integers = new TreeSet<>(Set.<Integer>of(23, 45, 12, 56));


    }
}
