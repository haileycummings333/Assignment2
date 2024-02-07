import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class PerformanceComp {

    public static void main(String[] args)throws IOException {

        //printwriter "how to" from youtube - link in pdf with text answers
        PrintWriter performFile = new PrintWriter(new FileWriter("performance_results.txt"));


        // run Tester.test() method with 20 iterations for each algorithm
        //for each of the following array sizes: 100, 500, 1000, 2000, 5000,
        // 10000, 20000, 75000, 150000
        SortingAlgorithm[] sortingAlgorithms = {
                new BubbleSort(), new InsertionSort(), new SelectionSort(),
                new ShellSort(), new QuickSort(),
                new MergeSort()
        };

        int[] arraySizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        int iterations = 20;

        for (SortingAlgorithm sortingAlg : sortingAlgorithms) {
            performFile.println("Sorting Algorithm: " + sortingAlg.getClass().getSimpleName() + "\n");



            for (int j : arraySizes) {
                //create a tester for the current alg
                Tester tester = new Tester(sortingAlg);
                //print test results in txt file
                performFile.println(tester.test(iterations, j, false));

            }
        }

        //need to close writer
        performFile.close();


    }
}