package src.com.dhanush.Exercise.Set6Arrays;

import java.util.Arrays;

public class ArrayMagicMain {
    public static void main(String[] args) {
        ArrayMagic arrayMagic = new ArrayMagic();
        int[] array = {1,1,1,1,1};
        System.out.println(arrayMagic.doesHaveElementGreaterThan(array, 4));
        System.out.println(arrayMagic.findSecondLargestElement(array));
        System.out.println(arrayMagic.isSorted(array));
        System.out.println(Arrays.toString(arrayMagic.reverseArray(array)));
    }
}
