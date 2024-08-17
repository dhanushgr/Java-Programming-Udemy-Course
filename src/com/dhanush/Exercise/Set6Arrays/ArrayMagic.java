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

    /**
     * This method finds and returns the second-largest element in the given array.
     *
     * @param array the array in which to find the second-largest element
     * @return the second-largest element in the array
     */

    public int findSecondLargestElement(int[] array) {

        if (array.length < 2) {
            return -1;  // Return -1 if the array has less than 2 elements.
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            }
            else if (element > secondLargest && element < largest) {
                secondLargest = element;
            }
        }

        // If there is no second-largest element (all elements in the array are the same), return -1
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }


    /**
     * This method checks if the input array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if the array is sorted, false otherwise
     */
    public boolean isSorted(int[] array) {

        if(array.length <= 1){
            return true;
        }

        int prev = Integer.MIN_VALUE;
        int current = Integer.MIN_VALUE;

        for(int element : array){
            prev = current;
            current = element;

            if(current >= prev){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    //Alternative method

//        public boolean isSorted(int[] array) {
//
//            // Edge case: If the array length is 1 or less, it is technically sorted, so return true.
//            if (array.length <= 1) {
//                return true;
//            }
//
//            // Iterate over the array, starting from the second element
//            for (int i = 1; i < array.length; i++) {
//                // If the current element is less than the previous one, the array is not sorted, so return false.
//                if (array[i] < array[i - 1]) {
//                    return false;
//                }
//            }
//
//            // If the method has not returned yet, that means no elements were out of order, so the array is sorted.
//            return true;
//        }


    /**
     * This method reverses an array.
     *
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {

        if(array.length <= 1){
            return array;
        }

        int[] reversedArray = new int[array.length];

        int start = 0;
        int end = array.length - 1;

        while(start <= end){
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];
            start++;
            end--;
        }
        return reversedArray;
    }
}
