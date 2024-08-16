package src.com.dhanush.Exercise.Set6Arrays;

public class ArrayMagic {
    /**
     * This method determines whether there's an element greater than a given number in an array.
     *
     * @param array The array to search through.
     * @param number The number to compare with the array elements.
     * @return True if there's an element greater than the given number in the array, false otherwise.
     */
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        for(int arr:array){
            if(arr > number){
                return true;
            }
        }
        return false;
    }
}
