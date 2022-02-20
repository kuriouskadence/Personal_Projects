import java.util.Scanner;
public class RainFall {

    public static String getMonth(double[] rainFall, double num) {
            switch((int)num){
                case 1:
                    return "January";
                case 2:
                    return "Febuary";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
                default:
                    return "No";
            }
           
        }

    public static double totalRainFallYearly(double[] rainFall) {
        double sum = 0;
        for(int i = 0; i < rainFall.length; i++) {
            sum += rainFall[i];
        }
        return sum;
    }

   public static double averageMonthlyRainFall(double[] rainFall) {
        int addedUp = 0;
        for (int i = 0; i < rainFall.length; i++) {
            addedUp += rainFall[i];
        }
        double average = (double) addedUp / rainFall.length;
        return average;
   }

   public static String monthWithHighestRainFall(double[] rainFall) {
       double highest = 0;
        for(int i = 0; i < rainFall.length; i++) {
            if(rainFall[i] < rainFall[i + 1]) {
                highest = rainFall[i + 1];
            }
        }
        return getMonth(rainFall, highest);
   }

   public static String monthWithLowestRainFall(double[] rainFall) {
        double lowest = 0;
        for(int i = 0; i < rainFall.length; i++) {
            if(rainFall[i] > rainFall[i + 1]) {
             lowest = rainFall[i + 1];

            }
        }
        return getMonth(rainFall, lowest);
   }


    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        double[] rainFall = new double[12];

        for(int i = 1; i <= rainFall.length; i++) {
            System.out.print("Enter rainfall for month " + i + ":");
            double givenInput = input.nextDouble();
            while(givenInput < 0) {
                System.out.print("Enter rainfall for month " + i + ":");
                givenInput = input.nextDouble();
            }
        }
        input.close();

        totalRainFallYearly(rainFall);
        System.out.println();

        averageMonthlyRainFall(rainFall);
        System.out.println();

        monthWithHighestRainFall(rainFall);
        System.out.println();

        monthWithLowestRainFall(rainFall);
        System.out.println();
    }
}