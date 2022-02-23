import java.util.Scanner;

public class LandTract {
    private static int length;
    private static int width; 
    public static Scanner input = new Scanner(System.in);

    public LandTract(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength(int length) {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth(int width) {
        return width;
    }

    public static int findArea(int length, int width) {
        return length * width;
    }

    public static boolean equals(LandTract objectOne, LandTract objectTwo){
        if(objectOne == objectTwo){
            return true;
        } else{
            return false;
        }
    }
   @Override
   public String toString(){
       String str = "";
       str += "LandTract object with length " + length + " and width " + width;
       return str;
    }

   public static void main(String[] args) {
     int obj1length;
     int obj1width;
     int obj2length;
     int obj2width;

     System.out.print("Enter object 1's length: ");
     obj1length = input.nextInt();
     System.out.print("Enter object 1's width: ");
     obj1width = input.nextInt();
     System.out.print("Enter object 2's length: ");
     obj2length = input.nextInt();
     System.out.print("Enter object 2's width: ");
     obj2width = input.nextInt();
     LandTract objectOne = new LandTract(obj1length, obj1width);
     LandTract objectTwo = new LandTract(obj2length, obj2width);

    System.out.println(objectOne.findArea(obj1length, obj1width));
    System.out.println(objectTwo.findArea(obj2length, obj2width));

    System.out.println(objectOne.toString());
    System.out.println(objectTwo.toString());

    if(equals(objectOne, objectTwo) == true){
        System.out.println("These two tracts have the same size.");
    } else {
        System.out.println("These two tracts do not have the same size.");
    }
       
   }
}
