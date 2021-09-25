import java.lang.Math;

public class WordMatch1 {
    private String secret;

    public WordMatch1(String word) {
        this.secret = word;
    }

    /**
     * @param guess
     * @return number of occurances of guess in secret times the length of guess sqared
     */
    public int scoreGuess(String guess) {
        int subStringCount = 0;
        int guessLength = guess.length();
        for (int i = 0; i <= secret.length() - guessLength; i++) {
            if (secret.substring(i, i+guessLength).equals(guess)) {
                subStringCount++;
            }
        }
        return subStringCount * guessLength * guessLength;
    }

    public static void test2() {
        WordMatch game = new WordMatch("aaaabb");
        String [] guesses = {"a", "aa", "aaa", "aabb", "c" };
        int [] answers = {4, 12, 18, 16, 0 };
        for (int i = 0; i < guesses.length; i++) {
            if (game.scoreGuess(guesses[i]) == answers[i]) {
                System.out.println("\u001B[32m" + " TEST " + (i + 5) + " SUCCEEDED " + "\u001B[0m");
            } else {
                System.out.println("\u001B[31m" + " TEST " + (i + 5) + " FAILED " + "\u001B[0m");
            } 
        }
    }

    public static void test1() {
        WordMatch game = new WordMatch("mississippi");
        String [] guesses = {"i", "iss", "issipp", "mississippi" };
        int [] answers = {4, 18, 36, 121};
        for (int i = 0; i < guesses.length; i++) {
            if (game.scoreGuess(guesses[i]) == answers[i]) {
                System.out.println("\u001B[32m" + " TEST " + (i + 1) + " SUCCEEDED " + "\u001B[0m");
            } else {
                System.out.println("\u001B[31m" + " TEST " + (i + 1) + " FAILED " + "\u001B[0m");
            } 
        }
    }
    public static void main(String[] args) {
        // WordMatch game = new WordMatch("mississippi");
        // System.out.println(game.scoreGuess("iss"));
        test1();
        test2();
        
    }

}