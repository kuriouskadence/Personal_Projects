import java.util.Scanner;
public class AreaClass {

    static double pi = Math.PI;
    static String[] options = {"Circle", "Rectangle", "Cylinder"};
    static Scanner input = new Scanner(System.in);

    public static double findArea(int radius, double pi){
        return pi * radius * radius;
    }

    public static int findArea(int width, int height) {
        return height * width;
    }

    public static double findArea(double pi, int radius, int height) {
        return pi * radius * radius * height;
    }
    
    public static void getInput() {
        for(int i = 0; i < options.length; i++) {
            System.out.println("Enter which shape's area you would like to find: ");
            System.out.println("\t(Circle = 1; Rectangle = 2; Cylinder = 3: ");
            int choice = input.nextInt();

            if(choice == 1) {
                System.out.println("You've picked Cirlce! ");
                System.out.println("Enter the radius: ");
                int radius = input.nextInt();
            } else if(choice == 2) {
                System.out.println("You've picked Rectangle! ");
                System.out.println("Enter the width: ");
                int width = input.nextInt();
                System.out.println("Enter the height: ");
                int height = input.nextInt();
            } else if(choice == 3) {
                System.out.println("You've picked Cylinder! ");
                System.out.println("Enter the radius: ");
                int radius = input.nextInt();
                System.out.println("Enter the height: ");
                int height = input.nextInt();
            }
        }
        
    }
    public static void main (String[] args) {
        getInput();
        AreaClass areas = new AreaClass();

        areas.findArea(radius, pi);
        areas.findArea(width, height);
        areas.findArea(pi, radius, height);


    }
}