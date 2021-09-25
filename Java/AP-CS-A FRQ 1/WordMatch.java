
public class WordMatch {

    /** The secret string */
    private String secret;

    /** Constructs a WordMatch object with the given secret string of lowercase letters */
    public WordMatch(String word){
        secret = word.toLowerCase();
        // word = word.toLowerCase();
    }

    /** Returns a score for guess, as described in part (a) 
     * Precondition: 0 < guess.length() <= secret.length()
    */
    public int scoreGuess (String guess) {
        int numOccurences = 0;
        /** in this loop, we start at the 0 index, and stop if the index is greater than or less than the secret length miuns the guess length, index++ makes it move  */
        for (int index = 0; index <= secret.length() - guess.length(); index++) {
            /** secret character at index compared to guess character at index 0 ( so like if guess is iss than it would compare secret at index to guesses first index which would be i) */
            if (secret.charAt(index) == guess.charAt(0)) {
                /**  */
                if (secret.substring(index, index + guess.length()).equals(guess)) {
                    numOccurences++;
                }
            }
        }
        /** */
        return (int) Math.pow(guess.length(), 2) * numOccurences;
    }

    public static void test1(String testLabel, String secret, String [] guesses, int [] answers) {
        WordMatch game = new WordMatch(secret);
        for (int i = 0; i < guesses.length; i++){
            if (game.scoreGuess(guesses[i]) == answers[i]) {
                System.out.println("\u001B[32m" + testLabel + " Guess " + i + " Succeeded" + "\u001B[0m");
            } else {
                System.out.println("\u001B[31m" + testLabel + " Guess " + i + " Failed" + "\u001B[0m");
            }
        }
            
        

    }

    public static void main(String[] args) {
        String [] guesses = {"i", "iss", "issipp", "mississippi"};
        int [] answers = {4, 18, 36, 121};
        test1("Part A1", "mississippi", guesses, answers);
        System.out.println();
        
        guesses = new String[] {"a", "aa", "aaa", "aabb", "c"};
        answers = new int[] {4, 12, 18, 16, 0};
        test1("Part A2", "aaaabb", guesses, answers);
        System.out.println();
    }




}
