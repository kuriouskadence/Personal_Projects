import java.util.Scanner;

public class LandTract {
    private int length;
    private int width; 
    public static Scanner input = new Scanner(System.in);

    public LandTract(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int findArea() {
        return length * width;
    }

    public boolean equals(LandTract objectTwo){
        if(length == objectTwo.length && width == objectTwo.width){
            return true;
        } else if(length == objectTwo.width && width == objectTwo.length) {
            return true;
        } else {
            return false;
        }
    }

   @Override
   public String toString(){
       String str = "";
       str += "LandTract object with length " + this.length + " and width " + this.width;
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

    System.out.println(objectOne.findArea());
    System.out.println(objectTwo.findArea());

    System.out.println(objectOne);
    System.out.println(objectTwo);

    if(objectOne.equals(objectTwo)) {
        System.out.println("The two tracts have the same size.");
    } else {
        System.out.println("The two tracts do not have the same size.");
    }
       
   }
}
