
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

    public String findBetterGuess(String guess1, String guess2){
        /** the number value of each score guess eaquals the score guess value  */
        int scoreGuess1 = scoreGuess(guess1);
        int scoreGuess2 = scoreGuess(guess2);
        /** if score guess 1 is greater than score guess 2, then return guess 1 (ten) */
        if(scoreGuess1 > scoreGuess2){
            return guess1;
        } /** else if score guess 2 is greater than score guess 1, return guess 2 (nation) */
        else if(scoreGuess2 > scoreGuess1){
            return guess2;

        } /** if both guesses have the same score value, compare them and return the greater one alphabetically  */
        /** guess 1 compared to guess 2, if guess 1 is greater return guess 1 */
        if(guess1.compareToIgnoreCase(guess2) > 0 ){
            return guess1;
        } /** if guess 1 isnt the greater one, then just return guess 2 */
       return guess2;
        
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


    public static void test2(String testLabel, String secret, String [] inputs, String [] answers) {
        WordMatch game = new WordMatch(secret);
       int counter = 0;
       while(counter < answers.length) {
            if (game.findBetterGuess(inputs[2*counter], inputs[2*counter+1]) == answers[counter]){
                System.out.println("\u001B[32m" + testLabel + " Attempt " + counter + " Succeeded" + "\u001B[0m");
            } else{
                System.out.println("\u001B[31m" + testLabel + " Attempt " + counter + " Succeeded" + "\u001B[0m");
            }
            counter++;
       }
    }

    public static void main(String[] args) {
        // String [] guesses = {"i", "iss", "issipp", "mississippi"};
        // int [] answers = {4, 18, 36, 121};
        // test1("Part A1", "mississippi", guesses, answers);
        // System.out.println();
        
        // guesses = new String[] {"a", "aa", "aaa", "aabb", "c"};
        // answers = new int[] {4, 12, 18, 16, 0};
        // test1("Part A2", "aaaabb", guesses, answers);
        // System.out.println();

        String [] inputs = {"ten", "nation", "con", "cat"};
        String [] answers = {"nation", "con"};
        test2("Part B", "Concatenation", inputs, answers);
        System.out.println();
    }





}
