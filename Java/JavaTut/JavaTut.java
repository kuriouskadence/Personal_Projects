
public class JavaTut {
    public static void main(String[] args) {
       conditionals();
    }


    public static void printNewLine() {
        System.out.print("No Newline");  // \n means new line
        System.out.println("Newline ");
    }


    public static void variables(){
        int intNum = 5;
        float floatNum = 5.123f;
        double doubleNum = 5.123;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println(intNum + floatNum);
        System.out.println(floatNum / doubleNum);

        char favLetter = 'j';
        System.out.println(favLetter);

        String favWord = "haiiiii";
        System.out.println(favWord);

        boolean ableToVote = false;
        System.out.println(ableToVote);
        System.out.println(5 == 5);

    }

    public static double divideThrice(double x, double y ) {
        double result = x / y;
        result /= y;
        result = result / y;
        return result;
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void arraysLoops() {
        int [] intArr = new int[5];
        double [] doubleArr = new double[] {2.1, 3.72, 8, 10.56, 11, 15.09};

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = ((i + 12) * 4 ) % 3;
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
      

        for (int i = 0; i < doubleArr.length; i++) {
            System.out.println(doubleArr[i]);
        }
    }

    public static void conditionals() {
        int age = 14;
        boolean canVote = (age >= 18);
        String student = (age >= 14 && age <= 18) ? "HighSchool" : "Not HighSchool";

        // print(Boolean.toString(canVote));
        // print(student);

        if (canVote) {
            print("Don't forget to register to vote");
        }
        else {
            print("Wait til you're old enough L o L ");
        }
    }
}