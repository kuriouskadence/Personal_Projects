
import java.util.Scanner;
public class RomanNumerals {
    
    public static String convertArabicToRoman(int num){
        switch(num){
            case 1:
                return "I";
            case 2:
                return "II";

            case 3:
                return "III";

            case 4:
                return "IV";

                case 5:
                return "V";

            case 6:
                return "VI";

            case 7:
                return "VII";

            case 8:
                return "VIII";

            case 9:
                return "IX";

            case 10:
                return "X";

            default:
                return "No";
            
        }
       
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        while(num < 1 || num > 10) {
            System.out.print("Enter a number within the range of 1-10: ");
            num = input.nextInt();
        }
        System.out.println(num + " ==> " + convertArabicToRoman(num));
        input.close();
        
        
    }
}