import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int trct1length;
        int trct1width;
        int trct2length;
        int trct2width;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Tract 1's length: ");
        trct1length = input.nextInt();
        System.out.print("Enter Tract 1's width: ");
        trct1width = input.nextInt();
        System.out.print("Enter Tract 2's length: ");
        trct2length = input.nextInt();
        System.out.print("Enter Tract 2's width: ");
        trct2width = input.nextInt();
        LandTract tractOne = new LandTract(trct1length, trct1width);
        LandTract tractTwo = new LandTract(trct2length, trct2width);
   
       System.out.println(tractOne.findArea());
       System.out.println(tractTwo.findArea());
   
       System.out.println(tractOne);
       System.out.println(tractTwo);
   
       if(tractOne.equals(tractTwo)) {
           System.out.println("The two tracts have the same size.");
       } else {
           System.out.println("The two tracts do not have the same size.");
       }
    }
}
