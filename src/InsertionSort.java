public class InsertionSort extends SortingAlgorithm {
    @Override
    public int[] sort(int[] input) {
        int n = input.length;
        for(int i =1; i < n; i++){
            int j = i;
            while(j> 0 && input[j] < input[j-1]){
                int temp = input[j];
                input[j] = input[j-1];
                input[j-1] = temp;
                j--;
            }
        }
        return input;
    }
}
