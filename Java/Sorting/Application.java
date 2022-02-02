public class Application {

    public static void printArr(int[] array) {
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++) {
            if (i == array.length - 1 ) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", "); 
            }
        }
        System.out.print(" ]\n");
    }

    public static void main(String [] args) {
        int [] array = {5, 2, 1, 7, 2, 3, 4};
        // printArr(array);
        BubbleSort bSort = new BubbleSort(array);
        printArr(bSort.getArr());

        array = new int[]{58, 20, 24, 30 ,67, 23, 56};

        SelectionSort sSort = new SelectionSort(array);
        printArr(sSort.getArr());

        array = new int[]{8, 10, 23, 78, 45, 2, 42};

        InsertionSort iSort = new InsertionSort(array);
        printArr(iSort.getArr());

    }




}