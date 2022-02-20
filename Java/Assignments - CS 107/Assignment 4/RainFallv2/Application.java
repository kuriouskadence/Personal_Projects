import java.util.Scanner;
public class Application {

    static String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static double[] getInput() {
        Scanner input = new Scanner(System.in);
        double[] rainFall = new double[12];

        for(int i = 0; i < rainFall.length; i++) {
            System.out.print("Enter rainfall for " + months[i] + ": ");
            double givenInput = input.nextDouble();
            while(givenInput < 0) {
                System.out.print("Enter rainfall for " + months[i] + ": ");
                givenInput = input.nextDouble();
            }
            rainFall[i] = givenInput;
        }
        input.close();
        return rainFall;
    }

    public static void main (String [] args) {
        RainFallv2 rain = new RainFallv2(getInput());
        System.out.println("Total Rain Fall: " + rain.totalRainFallAnnually());
        System.out.println("Average Monthly Rain Fall: " + rain.averageMonthlyRainFall());
        System.out.println("Month with the Highest Rain Fall: " + rain.monthWithHighestRainFall());
        System.out.println("Month with the Lowest Rain Fall: " + rain.monthWithLowestRainFall());

    }
}