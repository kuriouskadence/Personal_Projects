import javax.swing.event.SwingPropertyChangeSupport;

public class Student {

    String[] classSchedule;
    String major;
    double[] grades;
    double classAttendance;

    public Student() {
        classSchedule = new String[0];
        major = "";
        grades = new double[0];
        classAttendance = 0;
    }
    
    public Student(String[] classSchedule, String major, double[] grades, double classAttendance) {
        this.classSchedule = classSchedule;
        this.major = major;
        this.grades = grades;
        this.classAttendance = classAttendance;
    }

    public void setClassSchedule(String[] classSchedule) {
        this.classSchedule = classSchedule;
    }

    public String[] getClassSchedule() {
        return classSchedule;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double[] getGrades() {
        return grades;
    }
    
    public void setClassAttendance(double classAttendance) {
        this.classAttendance = classAttendance;
    }

    public double getClassAttendance() {
        return classAttendance;
    }

    public void dropClass(int index) {
        String[] newClassSchedule = new String[classSchedule.length - 1];
        int j = 0;
        for(int i = 0; i < classSchedule.length; i++) {
            if(i != index) {
                newClassSchedule[j++] = classSchedule[i];
            }
        }
        setClassSchedule(newClassSchedule);

        double[] newGrades = new double[grades.length - 1];
        j = 0;
        for(int i = 0; i < grades.length; i++) {
            if(i != index) {
                newGrades[j++] = grades[i];
            }
        }
        setGrades(newGrades);
    }

    public double getGPA(double[] grades) {
        int grade = 0;
        for(int i = 0; i < grades.length; i++) {
            grade += getGradePoint(grades[i]);
        }
        return grade/grades.length;
    }

    public int getGradePoint(double grade) {
        if (grade <= 100 && grade >= 90){
            return 4;
        } else if (grade < 90 && grade >= 80){
            return 3;
        } else if (grade < 80 && grade >= 70){
            return 2;
        } else if (grade < 70 && grade >= 60){
            return 1;
        } else {
            return 0;
        }
    }

    // @Override
    // public String toString() {
    //     String str = "";
    //     str + "Student's class schedule: " + getClassSchedule();
    //     System.out.println();
    //     str + "Student's major: " + getMajor();
    //     System.out.println();
    //     str + "Student's grades: " + getGrades() + " and GPA: " + getGPA(grades);
    //     System.out.println();
    //     str + "Student's attendance: " + getClassAttendance();
        
    // }


}