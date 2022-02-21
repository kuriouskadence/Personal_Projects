public class Overload {


    public static String getLunch() {
        return "Pizza";
    }

    public static int getLunch(int i) {
        return i;
    }

    public static int getLunch(double a, int j) {
        return j + (int)a;
    }

    public static int getLunch(int j, double a) {
        return 1;
    }
    
}
