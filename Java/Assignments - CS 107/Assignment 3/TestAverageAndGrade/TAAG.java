import java.util.Scanner;
public class TAAG {

    public static double calcAverage (int[] testScores) {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        System.out.println("SUM " + sum);
        double average = (double) sum / testScores.length;
        return average;
    }

    public static String determineGrade (int testScore) {
        if (testScore >= 90 && testScore <= 100){
            return "A";
        }
        else if (testScore >= 80 && testScore <= 89) {
            return "B";
        }
        else if (testScore >= 70 && testScore <= 79) {
            return "C";
        }
        else if (testScore >= 60 && testScore <= 69) {
            return "D";
        }
        else if (testScore <= 60) {
            return "F";
        } 
        else {
            return "N/A";
        }
    }
    

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int numTestScores = 5;
        int[] testScores = new int[numTestScores];
        for (int i = 0; i < numTestScores; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            testScores[i] = input.nextInt();
        }
        for (int i = 0; i < numTestScores; i++) {
            System.out.println("Test number " + (i + 1) + ": " + determineGrade(testScores[i]));
        }
        double avg = calcAverage(testScores);
        System.out.println("Test Average: " + avg + " - " + determineGrade((int) avg));

        input.close();
    }
}
