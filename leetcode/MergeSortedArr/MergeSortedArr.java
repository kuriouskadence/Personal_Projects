public class MergeSortedArr {
    public int[] combine(int[] arr1, int[] arr2) {
        int[] fullArr = new int[arr1.length + arr2.length];
        int i = 0; 
        int j = 0;
        int k = 0;

        while ( i != arr1.length && j != arr2.length) {
            if (arr1[i] > arr2[j]){
                // fullArr[k++] = arr2[j++]
                fullArr[k] = arr2[j];
                j++;
            } else {
                fullArr[k] = arr1[i];
                i++;
            }
            k++;
        }

        while (i < arr1.length){
            fullArr[k++] = arr1[i++];
        }  
        while (j < arr2.length) {
            fullArr[k++] = arr2[j++];
        }

        return fullArr;

    } 

    public String printArr(int [] arr) {
        String printStr = "[ ";
        for (int i = 0; i < arr.length; i++) {
            printStr += arr[i] + ", ";
        }
        printStr += "]";
        System.out.println(printStr);
        return printStr;
    }

    public static void main(String[] args) {
        MergeSortedArr MSA = new MergeSortedArr();
        MSA.printArr(MSA.combine(new int[]{1,2,4}, new int[]{1,3,4}));
        MSA.printArr(MSA.combine(new int[]{}, new int[]{0}));
    }

}
