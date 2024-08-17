package src.com.dhanush.Exercise.Set6Arrays;

public class BiArrayMain {
    public static void main(String[] args) {
        int[] array1 = {1,5,8,7};
        int[] array2 = {1,5,8,7};

        BiArray biArray = new BiArray(array1, array2);

        System.out.println(biArray.areSumsEqual());
    }
}
