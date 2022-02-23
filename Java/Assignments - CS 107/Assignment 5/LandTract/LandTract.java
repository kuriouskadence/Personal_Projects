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

    public boolean equals(LandTract tractTwo){
        if(length == tractTwo.length && width == tractTwo.width){
            return true;
        } else if(length == tractTwo.width && width == tractTwo.length) {
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
     int trct1length;
     int trct1width;
     int trct2length;
     int trct2width;

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
