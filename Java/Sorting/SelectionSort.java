public class SelectionSort extends Sort {
    
    public SelectionSort(int[] arr) {
        super(arr);
    }

    @Override
    public void ascendSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexSmallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexSmallest]) {
                    indexSmallest = j;
                }
            }
            swap(i, indexSmallest);
        }
    }

}
