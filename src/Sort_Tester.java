import java.io.*;
import java.nio.file.ReadOnlyFileSystemException;

public class Sort_Tester {

    FileWriter fw;
    BufferedWriter bw;

    public static void main(String[] args) {

        Sort_Tester sorter = new Sort_Tester();
    }

    public Sort_Tester() {

        try {
            // Create new file
            String path="N:\\Documents\\IntelliJ\\dsa-sorting-algorithm\\test.csv";
            File file = new File(path);

            fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
        }
        catch(Exception e){
            System.out.println(e);
        }

        java.util.Random random = new java.util.Random();


        writeToFile("Array length, Bubble sort, Insertion Sort, Merge Sort, QuickS ort\n");

        for (int j = 1000; j < 200001; j = j +1000) {
            int[] arr = new int[j];
            System.out.println(j);
            writeToFile(j + ",");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(50);
            }

            Sort x = new Sort();

            long start;
            long end;
            long elapsedTime;

            int[] bubbleArray = arr.clone();
            int[] insertArray = arr.clone();
            int[] mergeArray = arr.clone();
            int[] quickArray = arr.clone();


            // Setup output file


            start = System.nanoTime();
            x.BubbleSort(bubbleArray);
            end = System.nanoTime();
            elapsedTime = end - start;
            //printArray(bubbleArray);
            System.out.println("Bubble sort took approximately: " + elapsedTime / 1000000 + " miliseconds");
            writeToFile(elapsedTime / 1000000 + ",");

            start = System.nanoTime();
            x.insertionSort(insertArray);
            end = System.nanoTime();
            elapsedTime = end - start;
            // printArray(insertArray);
            System.out.println("Insertion sort took approximately: " + elapsedTime / 1000000 + " miliseconds");
            writeToFile(elapsedTime / 1000000 + ",");

            start = System.nanoTime();
            x.mergSort(mergeArray, 0, mergeArray.length - 1);
            end = System.nanoTime();
            elapsedTime = end - start;
            //printArray(mergeArray);
            System.out.println("Merge sort took approximately: " + elapsedTime / 1000000 + " miliseconds");
            writeToFile(elapsedTime / 1000000 + ",");


            start = System.nanoTime();
            x.quickSort(quickArray, 0, quickArray.length - 1, x);
            end = System.nanoTime();
            elapsedTime = end - start;
            //printArray(quickArray);
            System.out.println("Quick sort took approximately: " + elapsedTime / 1000000 + " miliseconds");
            writeToFile(elapsedTime / 1000000 + "\n");

        }

        try{
            // Write in file
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public void printArray(int a[])
    {   // prints the array

        for(int i=0; i<a.length;i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();

    }

    public void writeToFile (String inputText) {
        try{


            // Write in file
            bw.write(inputText);


        }
        catch(Exception e){
            System.out.println(e);
        }
    }


}