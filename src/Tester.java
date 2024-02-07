import java.util.Random;

public class Tester {
    private SortingAlgorithm sortingAlgorithm;

    //A constructor for the Tester that takes as parameter the sorting
    //algorithm to be tested
    public Tester(SortingAlgorithm sa) {
        this.sortingAlgorithm = sa;
    }


    // create an array of integers of the given size.
    // fill it with random numbers
    private int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    //run the sorting algorithm’s sorty method. it should record and return the time it takes
    //to sort the array
    private double singleTest(int size, boolean isKSorted) {
        int[] arrayToSort;
        if (isKSorted) {
            arrayToSort = generateKSorted(generateRandomArray(size));
        } else {
            arrayToSort = generateRandomArray(size);
        }

        long startTime = System.nanoTime();
        sortingAlgorithm.sort(arrayToSort);
        long endTime = System.nanoTime();

        // convert nanoseconds to milliseconds

        //Inside your single test method, you will generate an array of random data of length N and time how long it
        //takes to sort the data using the sorting algorithm. You should NOT include in the timing the time it takes
        //to generate the random data. To do this record the system time before calling the sort() method, run the
        //method to sort the data, and record the system time after calling the method.
        //long start_time = System.nanoTime();
        //sorting.sorty(my_array);
        //long end_time = System.nanoTime();
        //These values are in nanoseconds. You will need to convert it to miliseconds
        return (endTime - startTime) / 1e6;
    }


    //Should run the singleTest method as many times as the number of
    //iterations provided and print to the console the average time the algorithm takes to sort an array of
    //the given size
    public String test(int iterations, int size, boolean isKSorted) {
        double totalTime = 0;

        for (int i = 0; i < iterations; i++) {
            totalTime += singleTest(size, isKSorted);
        }

        double averageTime = totalTime / iterations;
        return "Sorted " + size + " elements in " + averageTime + " ms (avg).";
    }

    //write a method generateKSorted(my_array) that fills the array that is
    //passed as an argument with 10-sorted data (each element is within 10 positions of its correct position in the
    //array).
    //Repeat the performance experiments from problem 5, this time with 10-sorted data instead of random data.
    //Hint: You can use shell sort to get an approximation of this by doing an iteration of k-sort with k =10
    public int[] generateKSorted(int[] input) {
        int n = input.length;

        for (int gap = 10; gap < n; gap++) {
            for (int i = gap; i < n; i++) {
                int tmp = input[i];
                int j = i;
                while (j >= gap && input[j - gap] > tmp) {
                    input[j] = input[j - gap];
                    j -= gap;
                }
                input[j] = tmp;
            }
        }
        return input;
    }


}
