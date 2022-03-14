public class TicTacToe {
    char[][] board;

    public TicTacToe(char[][] board){
        this.board = board;
    }

    public TicTacToe(){
        this.board = new char[board.length][board.length];
    }

    public String toString(){
        String returnStr = "";
        returnStr += "this is da board: " + board;
        return returnStr;
    }
    
}
