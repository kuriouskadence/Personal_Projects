public class Sort {

    int[] arr;

    public Sort(int[] arr) {
        this.arr = arr;
        ascendSort();
    }

    public void ascendSort() {}
    
    public int[] getArr() {
        return arr;
    }

    public void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}