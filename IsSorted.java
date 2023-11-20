import java.util.Arrays;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11}; // Example array
        int size = arr.length;
        boolean isSorted = isSorted(arr, size);
        System.out.println("Is the array sorted? " + isSorted);
    }

    static boolean isSorted(int[] arr, int size) {
        if (size == 0 || size == 1) {
            return true;
        }

        if (arr[0] > arr[1]) {
            return false;
        } else {
                                                //creates a new array from   to       
            boolean remainingPart = isSorted(Arrays.copyOfRange(arr, 1, size), size - 1);
            return remainingPart;
        }
    }
}
