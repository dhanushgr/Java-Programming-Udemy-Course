package src.com.dhanush.learnJava.Generics;

import java.util.*;

public class GenericsMain {

    //generic methods
    //static methods
    static <X> X doubleValue(X value){
        return value;
    }

    //the type could also extend a class, then the super classes(List) methods could be implemented.
    //when it extends a class like List, other classes type like integer, Number can't be used.
    static <X extends List> void duplicate(X list){
        list.addAll(list);
    }

    //Wildcard is (?). It is used when some/any/sub class extends the superClass
    //upper bounded wildcards:
    //helps in implementing common logic
    static double sumOfNumberList(List<? extends Number> numbers){
        double sum = 0.0;
        for(Number number:numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    //lower bounded wildcards:
    //helps to add numbers of anyType like Integer, Float, Double
    static void addACoupleOfNumbers(List<? super Number> numbers){
        numbers.add(1);
        numbers.add(2.0);
        numbers.add(3.0f);
        numbers.add(4l);
    }

    public static void main(String[] args) {

        List emptyList = new ArrayList<Number>();
        addACoupleOfNumbers(emptyList);
        System.out.println(emptyList);

        System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
        System.out.println(sumOfNumberList(List.of(1.1,2.2,3.3,4.4,5.5)));
        System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));

        String value = doubleValue(new String());
        Integer number = doubleValue(Integer.valueOf(5));
        ArrayList list = doubleValue(new ArrayList<>());

        ArrayList<Integer> num1 = new ArrayList<>(List.of(1,2,3,4));
        duplicate(num1);
        System.out.println(num1);

        LinkedList<Integer> num2 = new LinkedList<>(List.of(4,5,6,7));
        duplicate(num2);
        System.out.println(num2);

        MyCustomList<String> stringType = new MyCustomList();
        /*
            we can only add an element of type String in here
            I couldn't add an element of type Integer or a custom class of mine here
            This problem is solved in here.
         */
        stringType.addElement("element 1");
        stringType.addElement("element 2");
        stringType.addElement("element 3");
        stringType.removeElement("element 2");
        System.out.println(stringType);
        System.out.println(stringType.get(0));


        MyCustomList<Integer> integerType = new MyCustomList<>();
        integerType.addElement(23);
        integerType.addElement(32);
        integerType.addElement(43);
        System.out.println(integerType);
        System.out.println(integerType.get(0));
    }
}
