
// In a program, write a method that accepts two arguments: an array of integers and a number n. 
// The method should print all of the numbers in the array that are greater than the number n 
// (in the order that they appear in the array, each on their own line).

// In the same file, create a main method and call your function using the following data sets:

public class TwoArgs {
    public static void greaterThanNum(int[] num, int n ) {
        for(int i = 0; i < num.length; i++) {
            if(num[i] > n) {
                System.out.println(num[i]);
            }
        }
    }

    public static void main (String[] args) {
        greaterThanNum(new int[]{1, 5, 10, 2, 14, -3, 6}, 3);
        greaterThanNum(new int[]{10, 12, 15, 24}, 12);
    }
}