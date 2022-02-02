import java.util.Scanner;
public class RunningRace {


    public static void getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Runner One's full name: ");
        String run1Name = input.nextLine();
        System.out.print("Enter Runner One's running time in minutes: ");
        double run1Time = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Runner Two's full name: ");
        String run2Name = input.nextLine();
        System.out.print("Enter Runner Two's running time in minutes: ");
        double run2Time = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Runner Three's full name: ");
        String run3Name = input.nextLine();
        System.out.print("Enter Runner Three's running time in minutes: ");
        double run3Time = input.nextDouble();
        input.nextLine();

        double[] runnerTimes = {run1Time, run2Time, run3Time};
        String[] runnerNames = {run1Name, run2Name, run3Name};
        displayNamesInOrder(runnerTimes, runnerNames);
        
    }

    public static void displayNamesInOrder(double[] runnerTimes, String[] runnerNames) {
        for(int i = 0; i < runnerTimes.length - 1; i++) {
            int indexSmallest = i;
            for(int j = i + 1; j < runnerTimes.length; j++) {
                if(runnerTimes[j] < runnerTimes[indexSmallest]) {
                    indexSmallest = j;
                }
            }
            double temp = runnerTimes[i];
            runnerTimes[i] = runnerTimes[indexSmallest];
            runnerTimes[indexSmallest] = temp;

            String temp1 = runnerNames[i];
            runnerNames[i] = runnerNames[indexSmallest];
            runnerNames[indexSmallest] = temp1;
        }
        for(int i = 0; i < runnerNames.length; i++) {
            System.out.println(runnerNames[i] + " : " + runnerTimes[i] + " minutes");
        }
    }

    public static void main (String[] args) {
        getInput();
    }
}