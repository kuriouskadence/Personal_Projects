public class Application {
    public static void printArr(int[] array) {
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }

    public static void print2DArr(char[][] array) {
        System.out.println("[ ");
        for(int row = 0; row < array.length; row++) {
            for(int col = 0; col < array[col].length - 1; col++){
                System.out.print(array[row][col] + ", ");
            }
            System.out.println(array[row][array[row].length - 1]);
        }
        System.out.print("]");
        
    }
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        // game.setBoard(new char[][] {{'X', 'X', '*'}, {'*', '*', '*'}, {'*','*','*'}});
        // System.out.println(game);
        // game.print2DArr(game);
        // System.out.println(game.toString());
        // System.out.println(game);
        // System.out.println(game.checkRow(0, true));
        // System.out.println(game.checkRow(1, true));
        // System.out.println(game.checkCol(1, true));
        // System.out.println(game.checkDiag(2, true));
        game.playGame();


    }
}
