public class Fibo {


    public static int findFibo(int index) {
        if (index <= 1 ) {
            return 1;
        }
        int fiboNum = findFibo(index - 1 ) + findFibo(index - 2); 
        // System.out.println(index + " :: " + fiboNum);
        return fiboNum;
    }

    public static int findSumFibo(int fiboIndex) {
        if(fiboIndex == 0) {
            return findFibo(0);
        }  
        return findFibo(fiboIndex) + findSumFibo(fiboIndex - 1);
    }

    public static void main(String[] args) {
        System.out.println(findSumFibo(3));
    }






}