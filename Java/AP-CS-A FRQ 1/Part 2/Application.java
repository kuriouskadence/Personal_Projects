public class Application {

    static SingleTable t1 = new SingleTable(4, 74, 60.0);
    static SingleTable t2 = new SingleTable(8, 74, 70.0);
    static SingleTable t3 = new SingleTable(12, 76, 75.0);

    public static void test1() {
        CombineTable c1 = new CombineTable(t1, t2);
        if (c1.canSeat(9) == true) {
            System.out.println("\u001B[32m c1.canSeat(9) Succeeded \u001B[0m" );
        } else {
            System.out.println("\u001B[31m c1.canSeat(9) Failed \u001B[0m" );
        }
        if (c1.canSeat(11) == false) {
            System.out.println("\u001B[32m c1.canSeat(11) Succeeded \u001B[0m" );
        } else {
            System.out.println("\u001B[31m c1.canSeat(11) Failed \u001B[0m" );
        }
        if (c1.getDesirability() == 65.0) {
            System.out.println("\u001B[32m c1.getDesirability() Succeeded \u001B[0m" );
        } else {
            System.out.println("\u001B[31m c1.getDesirability() Failed \u001B[0m" );
        }
        
        
    }
    public static void test2() {
        CombineTable c2 = new CombineTable(t2, t3);
        if (c2.canSeat(18) == true) {
            System.out.println("\u001B[32m c2.canSeat(18) Succeeded \u001B[0m" );
        } else {
            System.out.println("\u001B[31m c2.canSeat(18) Failed \u001B[0m" );
        }
        if (c2.getDesirability() == 62.5) {
            System.out.println("\u001B[32m c2.getDesirability() Succeeded \u001B[0m" );
        } else {
            System.out.println("\u001B[31m c2.getDesirability() Failed \u001B[0m" );
        }
        t2.setViewQuality(80);

        if (c2.getDesirability() == 67.5) {
            System.out.println("\u001B[32m c2.getDesirability() Succeeded \u001B[0m" );
        } else {
            System.out.println("\u001B[31m c2.getDesirability() Failed \u001B[0m" );
        }
        
        
    }

    public static void main(String[] args) {
        test1();
        test2();
        test1();
    }
}
