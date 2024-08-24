package src.com.dhanush.learnJava.collections.Queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}

public class QueueMain {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(List.of("apple", "banana", "cat", "dog")); // addAll is a method used when you want to add multiple elements at once
        System.out.println(queue);
        queue.poll();   //removes the element which was inserted first FIFO
        System.out.println(queue);


        Queue<String> actors = new PriorityQueue<>(new StringLengthComparator());
        actors.addAll(List.of("stark","groot","madison","evans"));
        System.out.println(actors);
        actors.poll();
        System.out.println(actors);
        actors.offer("captainRogers");
        System.out.println(actors);
        actors.offer("missMarvel");
        System.out.println(actors);
        actors.poll();
        System.out.println(actors);

    }
}
