/**
 * Created by j.halloran on 09/06/2017.
 */
public class Tester {
    public static void main(String[] args) {
        int[] arr = {10, 24, 25, 78, 23, 4565, 56, 4, 5};
        int low = 0;
        int high = arr.length-1;
        int temp;
        while (low < high){
            while (low < arr.length && arr[low] % 2 == 0) {       // Find next odd numbers at bottom of list
                low++;           // Increment
            }
            while (high >= 0 && arr[high] % 2 == 1 ) {              // Find next even number at top of list
                high--;         // Decrement
            }
            if ( low < high ) {                         // Only swap if odd number is lower in list than even numbers
                // Swap values
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }

        for (int x: arr) {
            System.out.println(x);
        }
    }
}
