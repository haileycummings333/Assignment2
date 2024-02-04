import java.util.Arrays;

public class SortingAlg {
    public static void main(String[] args) {
        int[] insertionNumbers = {};
        System.out.println("Unsorted: " + Arrays.toString(insertionNumbers));
        insertionSort(insertionNumbers);
        System.out.println("Sorted: " + Arrays.toString(insertionNumbers));

        int[] selectionNumbers = {};
        System.out.println("Unsorted: " + Arrays.toString(selectionNumbers));
        selectionSort(selectionNumbers);
        System.out.println("Sorted: " + Arrays.toString(selectionNumbers));

    }


    public static void bubbleSort(){


    }

    public static void selectionSort(){
        for(int i =0; i < numbers.length-1; i++){
            int indexSmallest = i;
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[j] < numbers[indexSmallest]){
                    indexSmallest = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[indexSmallest];
            numbers[indexSmallest] = temp;
        }
    }

    public static void insertionSort(int[] numbers){
        for(int i =1; i < numbers.length; i++){
            int j = i;
            while(j> 0 && numbers[j] < numbers[j-1]){
                int temp = numbers[j];
                numbers[j] = numbers[j-1];
                numbers[j-1] = temp;
                j--;
            }
        }

    }

    public static void shellSort(){


    }


    public static void quickSort(int[] numbers, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }
        lowEndIndex = Partition(numbers, lowIndex, highIndex);

        quickSort(numbers, lowIndex, lowEndIndex);


    }

    public static void Partition(){


    }


    public static void mergeSort(){


    }
}