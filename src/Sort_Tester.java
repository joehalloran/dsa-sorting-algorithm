public class Sort_Tester {



    public static void main(String[] args)
    {

        int [] arr = new int [100000];


        java.util.Random random = new java.util.Random();


        for(int i=0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }

        Sort x = new Sort();

        long start;
        long end;
        long elapsedTime;

        int[] bubbleArray = arr.clone();
        int[] insertArray = arr.clone();
        int[] mergeArray = arr.clone();

        start = System.nanoTime();
        x.BubbleSort(bubbleArray);
        end = System.nanoTime();
        elapsedTime = end - start;
        //printArray(bubbleArray);
        System.out.println("Bubble sort took approximately: " + elapsedTime/1000000 + " miliseconds");

        start = System.nanoTime();
        x.insertionSort(insertArray);
        end = System.nanoTime();
        elapsedTime = end - start;
       // printArray(insertArray);
        System.out.println("Insertion sort took approximately: " + elapsedTime/1000000 + " miliseconds");

        start = System.nanoTime();
        x.mergSort(mergeArray, 0, mergeArray.length-1);
        end = System.nanoTime();
        elapsedTime = end - start;
        //printArray(mergeArray);
        System.out.println("Merge sort took approximately: " + elapsedTime/1000000 + " miliseconds");


    }

    static void printArray(int a[])
    {   // prints the array

        for(int i=0; i<a.length;i++)
            System.out.print(a[i]+",");

    }



}