public class ShowChar {

    public static void showCar(String word, int place) {
        char charactAt = word.charAt(place); // you can't turn a string into an int so i made it an char instead and that worked, word.charAt makes easier to find out what the character at a certain position is
        System.out.println(charactAt); // the method doesn't return anything, prints out the character at number stated 
    }


    public static void main (String[] args) {
        showCar("New York", 2);
    }
}