import java.util.Scanner;
public class SoftwareSales {

    public static double findDisc(int quantity){
        if (quantity >= 10 && quantity <= 19){
            return .2;
        }
        else if (quantity >= 20 && quantity <= 49) {
            return .3;
        }
        else if (quantity >= 50 && quantity <= 99) {
            return .4;
        }
        else if (quantity >= 100) {
            return .5;
        } 
        else {
            return 0;
        }

    }

    public static double calcPrice(int quantity) {
        final double retailPrice = 99.0;
        double discRate = findDisc(quantity);
        double preDisc = quantity * retailPrice;
        double discAmt = preDisc * discRate;
        double finalPrice = preDisc - discAmt;

        return finalPrice;
    }


    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of packages ordered: ");
        int quantity = input.nextInt();
        System.out.println(findDisc(quantity) * 100 + "%" + " ==> $" + calcPrice(quantity));
        input.close();
    }
}