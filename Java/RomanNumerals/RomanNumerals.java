/**
 * @name: Kadence Ly
 * @date: 08-24-21
 * @description: Write a program that asks the user to enter a number within the range of 1 through 10.   
 *                 Use a switch statement to display the Roman numeral version of that number.
 *                 Input Validation: Do not accept a number less than 1 or greater than 10.
 *                 Prompts And Output Labels. Use the following prompt for input: 
 *                 "Enter a number in the range of 1 - 10: ".
 *                 The output of the program should be just a Roman numeral, such as VII.
 *                 CLASS NAMES. Your program class should be called RomanNumerals
 */

 import java.util.Scanner;
public class RomanNumerals{
    
    public static void main(String[] args){
        System.out.println(convertToRoman(askForNum()));
    }
    
    public static int askForNum() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter a number in the range of 1 - 10: ");
            int num = input.nextInt();
            if (num < 1 || num > 10) {
                throw new Exception("Number is Out of Range! -_-");
            }
            return num;
        } catch (Exception error) {
            input.nextLine();
            System.out.println("ERROR: " + error);
            System.out.print("Try Again? ");
            String tryAgain = input.nextLine();
            if (tryAgain.toLowerCase().contains("y")) {
                askForNum();
            } else {
                System.out.println("Goodbyee");
            }
            return -1;
        }
    }

    public static String convertToRoman(int num) {
        String romanNum;
        switch (num) {
            case 1: 
                romanNum = "I";
                break;
            case 2: 
                romanNum = "II";
                break;  
            case 3: 
                romanNum = "III";
                break;  
            case 4: 
                romanNum = "IV";
                break; 
             case 5: 
                romanNum = "V";
                break;  
            case 6: 
                romanNum = "VI";
                break;  
            case 7: 
                romanNum = "VII";
                break;  
            case 8: 
                romanNum = "VII";
                break; 
            case 9: 
                romanNum = "IX";
                break;  
            case 10: 
                romanNum = "X";
                break;
            default:
                romanNum = "Not Found";
                break;

        }
        return romanNum;
    }



}