public class MergeSort extends SortingAlgorithm {
    @Override
    public int[] sort(int[] input) {
        mergeSort(input, 0, input.length - 1);
        return input;
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // find the midpoint
            int mid = (left + right) / 2;

            // recursively sort both halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create the temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // merge the temporary arrays

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of leftArray, if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // copy remaining elements of rightArray, if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
