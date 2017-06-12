/**
 * Created by j.halloran on 09/06/2017.
 */
public class Tester {
    public static void main(String[] args) {
        int[] arr = {10, 22, 28, 74, 24, 4564, 54, 4, 2, 4};
        int low = 0;
        int high = arr.length-1;
        int temp;
        while (low < high){
            while (low < arr.length && arr[low] % 2 == 0) {       // Find next odd numbers at bottom of list
                System.out.println("increment" + arr[low]);
                low++;           // Increment
            }
            while (high >= 0 && arr[high] % 2 == 1 ) {              // Find next even number at top of list
                System.out.println("Decrement" + arr[high]);
                high--;         // Decrement
            }
            if ( low < high ) {                         // Only swap if odd number is lower in list than even numbers
                // Swap values
                System.out.println("Swap " + arr[low] + " " + arr[high]);
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
