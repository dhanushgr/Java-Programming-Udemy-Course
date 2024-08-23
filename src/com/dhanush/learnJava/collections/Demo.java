package src.com.dhanush.learnJava.collections;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //This is immutable, because it used List.of().
        //you can't add or remove any element from it.
        List<String> words = List.of("Apple", "Banana", "cat", "Dog");
        System.out.println(words);

        List<String> wordsArray = new ArrayList<>(words);
        System.out.println(wordsArray);
        wordsArray.add(0, "hello");
        System.out.println(wordsArray);

        List<String> wordsLinkedList = new LinkedList<>(words);
        wordsLinkedList.remove(1);
        System.out.println(wordsLinkedList);

        List<String> wordsVector = new Vector<>(words);
        wordsVector.contains("Apple");
        System.out.println(STR."wordsArray: --> \{wordsArray}");

        for(String word : words){
            System.out.println(word);
        }
        //OR
        Iterator wordsIterator = words.iterator();

        while(wordsIterator.hasNext()){
            System.out.println(wordsIterator.next());
        }

        /*
            Iterator should be used while you are trying to modify something
            If you want to remove the elements from an Arraylist which ends with "at"(Bat, Cat)
            then you should use Iterator rather than Enhanced-for loop
         */
        Iterator<String> iterator = wordsArray.iterator();

        while (iterator.hasNext()){
            if(iterator.next().endsWith("at")){
                iterator.remove();
            }
        }


    }
}
