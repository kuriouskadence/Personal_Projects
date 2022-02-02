import java.util.Scanner;
public class SpeedOfSound {

    public static int findSpeed(String medium) {
        if(medium.equals("air")){
            return 1_100;
        }
         else if(medium.equals("water")){
            return 4_900;
        }
         else if(medium.equals("steel")){
            return 16_400;
        }
        else {
            return 0;
        }
    }

    public static double findTime(int distance, String medium) {
        int speed = findSpeed(medium);
        double time = (double) distance/speed;
        return time;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one - air, water, or steel: ");
        String medium = input.nextLine();
        while(!medium.equals("air") && !medium.equals("water") && !medium.equals("steel")) {
            System.out.println("Sorry, you must enter air, water, or steel.");
            System.out.print("Enter one- air, water, or steel: ");
            medium = input.nextLine();
        }
        System.out.print("Enter the distance the sound wave will travel: ");
        int distance = input.nextInt();
        System.out.print("It will take " + findTime(distance, medium) + " seconds");

        input.close();
    }






}