public class SelectionSort extends SortingAlgorithm {
    @Override
    public int[] sort(int[] input) {
        int n = input.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the found minimum element with the first element
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
        return input;
    }
}
