import java.util.Scanner;
import java.lang.Math;
public class AreaClass {

    static final double pi = Math.PI;
    static String[] options = {"Circle", "Rectangle", "Cylinder"};
    static Scanner input = new Scanner(System.in);

    public static double findArea(double radius){
        return pi * Math.pow(radius, 2);
    }

    public static int findArea(int width, int height) {
        return height * width;
    }

    public static double findArea(double radius, double height) {
        return pi * Math.pow(radius, 2) * height;
    }

    // public static void main(String[] args) {
    //     double radius = 0.5;
    //     System.out.println(findArea(radius));
    // }
    

    public static void main (String[] args) {
        System.out.println("Enter which shape's area you would like to find: ");
        System.out.print("\t(Circle = 1; Rectangle = 2; Cylinder = 3: ");
        int choice = input.nextInt();

        if(choice == 1) {
            System.out.println("You've picked Cirlce! ");
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();
            System.out.println("The Area of the Cirlce is: " + findArea(radius));
        } else if(choice == 2) {
            System.out.println("You've picked Rectangle! ");
            System.out.print("Enter the width: ");
            int width = input.nextInt();
            System.out.print("Enter the height: ");
            int height = input.nextInt();
            System.out.println("The Area of the Rectangle is: " + findArea(width, height));
        } else if(choice == 3) {
            System.out.println("You've picked Cylinder! ");
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();
            System.out.print("Enter the height: ");
            double height = input.nextDouble();
            System.out.println("The Area of the Cylinder is: " + findArea(radius, height));
        } 
    }
}