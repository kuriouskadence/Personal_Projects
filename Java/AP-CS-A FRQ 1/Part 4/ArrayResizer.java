public class ArrayResizer{
    public static boolean isNonZeroRow(int [][] array2D, int r) {
        for(int i = 0; i < array2D[r].length; i++) {
            if( array2D[r][i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D) {
        int counter = 0;
        for(int i = 0; i < array2D.length; i++) {
            if(isNonZeroRow(array2D, i)) {
                counter++;
            }
        }
        return counter;
    }

    public static int [][] resize(int [][] array2D) {
        int [][] nonZeroArr = new int [numNonZeroRows(array2D)][array2D[0].length];
        int index = 0;
        for(int i = 0; i < array2D.length; i++) {
            if(isNonZeroRow(array2D, i)) {
                nonZeroArr[index] = array2D[i];
                index++;
            }
        }
        return nonZeroArr;    
    }

    public static String arr2DToString(int [][] arr2D) {
        String rtnStr = "[";
        for(int i = 0; i < arr2D.length; i++) {
            rtnStr += "[";
            for (int j = 0; j < arr2D[i].length; j++) {
                rtnStr += arr2D[i][j] + ", ";
            }
            rtnStr = rtnStr.substring(0, rtnStr.length() - 2);
            rtnStr += "]";
        }
        rtnStr += "]";
        return rtnStr;
    }


    public static void main(String[] args) {
        int [][] array2D = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}};
        System.out.println(isNonZeroRow(array2D, 1));
        System.out.println(numNonZeroRows(array2D));
        System.out.println(arr2DToString(resize(array2D)));
    }
}