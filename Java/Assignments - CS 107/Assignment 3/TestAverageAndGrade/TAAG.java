import java.util.Scanner;
public class TAAG {

    public static int calcAverage (int t1, int t2, int t3, int t4, int t5) {
        int sum = t1 + t2 + t3 + t4 + t5;
        int average = sum / 5;
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
        System.out.print("Enter test score 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter test score 2: ");
        int number2 = input.nextInt();
        System.out.print("Enter test score 3: ");
        int number3 = input.nextInt();
        System.out.print("Enter test score 4: ");
        int number4 = input.nextInt();
        System.out.print("Enter test score 5: ");
        int number5 = input.nextInt();
        System.out.println("Test number 1: " + determineGrade(number1));
        System.out.println("Test number 2: " + determineGrade(number2));
        System.out.println("Test number 3: " + determineGrade(number3));
        System.out.println("Test number 4: " + determineGrade(number4));
        System.out.println("Test number 5: " +determineGrade(number5));
        System.out.println("Test Average: " + calcAverage(number1, number2, number3, number4, number5));

        input.close();
    }
}
