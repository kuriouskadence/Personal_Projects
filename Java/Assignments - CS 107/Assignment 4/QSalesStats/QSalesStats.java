import java.util.Scanner;


public class QSalesStats {
 
    public static void print1DArray(int[] array) {
        System.out.print("[ ");
        for(int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + " ]");
    }

    public static void print2DArray(int[][] array) {
        System.out.println("[");
        for (int row = 0; row < array.length; row++) {
            print1DArray(array[row]);
            System.out.println();
        }
        System.out.println("]");
    }

    public static int[][] getInput(int numDivisions, int numQ) {
        Scanner input = new Scanner(System.in);
        int[][] qSales = new int[numQ][numDivisions];
        for (int i = 0; i < numDivisions; i++) {
            System.out.println("Enter Quarterly Sales for Division " + (i + 1));
            for (int j = 0; j < numQ; j++) {
                System.out.print("Enter in Quarter " + (j + 1) + " Sales: ");
                qSales[j][i] = input.nextInt();
            }
        }
        return qSales;
    }

    public static int[] listOfSales(int[][] qSales, int qNum) {
        return qSales[qNum - 1];
    }

    public static void printListSales(int[][] qSales) {
       for(int q = 1; q <= qSales.length; q++) {
            System.out.print("Sales Figure for Quarter " + q + ": ");
            print1DArray(listOfSales(qSales, q));
            System.out.println();
       }
    }


    public static void changeQSales(int[][] qSales) {
        for (int d = 0; d < qSales[0].length; d++) {
            System.out.println("Change in Quarterly Sales for Divison " + (d + 1) );
            for(int q = 1; q < qSales.length; q++) {
                int change = (qSales[q][d] - qSales[q - 1][d]);
                if (change < 0) {
                    System.out.print("Decrease");
                    change *= -1;
                } else {
                    System.out.print("Increase");
                }
                System.out.println(" from Quarter " + (q + 1) + " to Quarter " + (q) + ": " + change);
            }
            System.out.println();
        }
    }

    public static int totalQuarterSales(int[][] qSales, int qNum) {
        int [] currQuarter = listOfSales(qSales, qNum); 
        int sum = 0;
        for(int d = 0; d < currQuarter.length; d++) {
             sum += currQuarter[d]; 
        }
        return sum;
    }

    public static void printAllQTotals(int[][] qSales) {
        for (int q = 1; q <= qSales.length; q++) {
            System.out.println("Total Sum of Quarter " + q + ": " + totalQuarterSales(qSales, q));
        }
    }

    public static void changeCSales(int[][] qSales) {
        for(int q = 2; q <= qSales.length; q++) {
            int change = totalQuarterSales(qSales, q) - totalQuarterSales(qSales, q - 1);
            if (change < 0 ) {
                System.out.print("Decrease");
                change *= -1;
            } else {
                System.out.print("Increase");
            }
            System.out.println(" from Quarter " + (q) + " to Quarter " + (q - 1) + ": " + change);
        }
    }

    public static double quarterSalesAverage(int[][] qSales, int qNum) {
       return (double) totalQuarterSales(qSales, qNum) / listOfSales(qSales, qNum).length;
    }

    public static void printAllSalesAverages(int[][] qSales) {
        for(int i = 1; i <= qSales.length; i++) {
            System.out.println("Total Sales Average for Quarter " + i + ": " + quarterSalesAverage(qSales, i));
        }
    }

    public static int findBiggestSale(int[] quarterlySales) {
        int indexBiggest = 0;
        for(int i = 1; i < quarterlySales.length; i++) {
            if(quarterlySales[indexBiggest] < quarterlySales[i]) {
                indexBiggest = i;
            }
        }
        return indexBiggest + 1;
    }

    public static void printHighestEachQuarter(int[][] qSales) {
        for(int q = 1; q <= qSales.length; q++) {
            System.out.println("Quarter " + q + " Highest Sales: Division " + findBiggestSale(listOfSales(qSales, q)));
        }
    }

    

    public static void main (String[] args) {
        int numDivisions = 2;
        int numQ = 4;
        int[][] qSales = {{2, 6}, {7, 10}, {4, 3}, {11, 8} };
        //int[][] qSales = getInput(numDivisions, numQ);

        System.out.println("\nQSALES ARRAY: ");
        print2DArray(qSales);
        System.out.println();

        printListSales(qSales);
        System.out.println();

        changeQSales(qSales);

        printAllQTotals(qSales);
        System.out.println();

        changeCSales(qSales);
        System.out.println();

        printAllSalesAverages(qSales);
        System.out.println();

        printHighestEachQuarter(qSales);
        System.out.println();
        
    }
    
}