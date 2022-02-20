import java.util.ArrayList;

public class GradeBook {

    private ArrayList<String> studentNames = new ArrayList<>();
    private int[][] allTestScores = new int[5][4];
    private char[] letterGrade = new char[5];

    public GradeBook(ArrayList<String> studentNames, int[][] allTestScores) {
        this.studentNames = studentNames;
        this.allTestScores = allTestScores;
        setLetterGrades();
    }

    public String getStudentName(int index) {
        return studentNames.get(index);
    }

    public double getGradeAverage(int index) {
        double average = 0;
        for(int i = 0; i < allTestScores[index].length; i++) {
            average += allTestScores[index][i];
        }
        return average / allTestScores[index].length;
    }

    public char calcStudentLetterGrade(int index) {
        double gradeAvg = getGradeAverage(index);
        if(gradeAvg <= 100 && gradeAvg >= 90){
            return 'A';
        } else if(gradeAvg < 90 && gradeAvg >= 80){
            return 'B';
        } else if(gradeAvg < 80 && gradeAvg >= 70){
            return 'C';
        } else if(gradeAvg < 70 && gradeAvg >= 60){
            return 'D';
        } else if (gradeAvg < 60 && gradeAvg >= 0){
            return 'F';
        } else {
            return '0';
        }
    }

    public void setLetterGrades(){
        for(int i = 0; i < letterGrade.length; i++){
            letterGrade[i] = calcStudentLetterGrade(i);
        }
    }

    public char getStudentLetterGrade(int index){
        return letterGrade[index];
    }
}