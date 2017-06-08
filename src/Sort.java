public class Sort {

    public Sort(){}


    /* Bubble Sort function */
    public void BubbleSort( int List[])
    {
        int temp;
        int size = List.length;
        for (int i = 0; i < (size - 1); i++)
        {
            for(int j=0; j< (size -(i+1)); j++)
            {
                if (List[j]> List[j+1])
                {
                    temp = List[j];
                    List[j]= List[j+1];
                    List[j+1] = temp;
                }
            }

        }
    }


    /* Insertion Sort function */
    public void insertionSort(int a[])
    {
        int size = a.length;

        for(int i=1; i<size; i++)
        {
            int  index = a[i];
            int j = i-1;
            while(index < a[j])
            {
                a[j+1]= a[j];
                a[j] = index;
                j--;
                if(j< 0)
                    break;
            }
        }
    }


    /* Merge Sort function */
    public static void mergSort(int[] a, int low, int high)
    {
        int N = high - low;
        if (N <= 1)
            return;
        int mid = low + N/2;
        // recursively sort 
        mergSort(a, low, mid);
        mergSort(a, mid, high);
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++)
        {
            if (i == mid)
                temp[k] = a[j++];
            else if (j == high)
                temp[k] = a[i++];
            else if (a[j]<a[i])
                temp[k] = a[j++];
            else
                temp[k] = a[i++];
        }
        for (int k = 0; k < N; k++)
            a[low + k] = temp[k];
    }

    public void quickSort(int[] numbers, int low, int high, Sort sorter) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            sorter.quickSort(numbers, low, j, sorter);
        if (i < high)
            sorter.quickSort(numbers, i, high, sorter);
    }

}