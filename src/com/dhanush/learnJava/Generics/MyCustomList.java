package src.com.dhanush.learnJava.Generics;

import java.util.ArrayList;

/*
    In generics mention <T> after class, MyCustomList<T>.
    It will make the class generics.
    When you are mentioning any dataType like String or Integer or any class.
    use <T> instead of <String> <Integer> <Class>
 */
//generic class
public class MyCustomList<T> {

    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    // returning the value of the given index of type T
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        return STR."MyCustomList{list=\{list}}";
    }
}
