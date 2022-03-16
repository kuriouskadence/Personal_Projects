public class Application {
    public static void main(String[] args) {
        char[][] a = {{'1','2'}, {'3','4'}};
        TicTacToe game = new TicTacToe();
        game.setA(a);
        System.out.println(a);
        game.print2DArr(a);
    }
}
