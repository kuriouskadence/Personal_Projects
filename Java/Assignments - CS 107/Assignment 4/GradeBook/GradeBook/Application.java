import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    static final int numStudents = 5;
    static final int numTestScores = 4;
    static ArrayList<String> studentNames = new ArrayList<>();
    static int[][] allTestScores = new int[numStudents][numTestScores];
    static Scanner input = new Scanner(System.in);

    public static void print1DArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println( array[array.length - 1] + " ]");
    }

    public static void print2DArray(int[][] array) {
        System.out.println("[ ");
        for(int row = 0; row < array.length; row++) {
            for(int col = 0; col < array[row].length - 1; col++){
                System.out.print(array[row][col] + ", ");
            }
            System.out.println(array[row][array[row].length - 1]);
        }
        System.out.println("]");
    }

    public static void print2DArrayBetter(int[][] array) {
        System.out.println("[ ");
        for(int row = 0; row < array.length; row++) {
            print1DArray(array[row]);
        }
        System.out.println("]");
    }

    public static void getNamesInput() {
        for(int i = 1; i <= numStudents; i++ ) {
            System.out.print("Enter Name of Student " + i + ": " );
            String nameInput = input.nextLine();
            while(nameInput.isBlank()){
                System.out.print("Try again! Enter Name of Student " + i + ": " );
                nameInput = input.nextLine();
            }
            studentNames.add(nameInput);
        }
        System.out.println(studentNames);
    }

    public static void getTSInput() {
        for(int i = 0; i < numStudents; i++) {
            System.out.println("Enter in " + studentNames.get(i) + "'s Test Scores:");
            for(int j = 0; j < numTestScores; j++) {
                System.out.print("\tEnter in Test Score #" + (j+1) + ": ");
                int testScoreInput = input.nextInt();
                while(testScoreInput < 0 || testScoreInput > 100) {
                    System.out.print("\tTry Again! Enter in Test Score #" + (j+1) + ": ");
                    testScoreInput = input.nextInt();
                }
                allTestScores[i][j] = testScoreInput;
            }
        }
        print2DArray(allTestScores);
    }

    public static void printAll(GradeBook grades){
        for(int i = 0; i < numStudents; i++) {
            System.out.println(grades.getStudentName(i) + " : " + grades.getGradeAverage(i) + " : " + grades.getStudentLetterGrade(i));
        }

    }

   public static void main(String[] args) {
        getNamesInput();
        getTSInput();

        GradeBook grades = new GradeBook(studentNames, allTestScores);
        printAll(grades);


    }
    
}
