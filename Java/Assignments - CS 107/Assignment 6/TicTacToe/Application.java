public class Application {
    public static void main(String[] args) {
        char[][] a = {{'X','X','X'}, {'X','X','X'}, {'X', 'X', 'O'}};
        TicTacToe game = new TicTacToe();
        game.setA(a);
        System.out.println(a);
        game.print2DArr(a);
        System.out.println();
        System.out.println(game.checkRow(2, true));
    }
}
