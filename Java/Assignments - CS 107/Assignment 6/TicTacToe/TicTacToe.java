import java.util.Scanner;
public class TicTacToe {
    char[][] board;
    char player1 = 'X';
    char player2 = 'O';

    public TicTacToe(){
        int n = 3;
        this.board = new char[n][n];
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                board[row][col] = '*';
            }
        }
    }

    public TicTacToe(char[][] board){
        this.board = board;
    }

    public void setBoard(char[][] array){
        this.board = array;
    }

    public char[][] getBoard() {
        return board;
    }

    public void playGame() {
        Scanner input = new Scanner(System.in);
        System.out.println(printInstructions());
        System.out.println(toString());
        for(int i = 0; i < board.length; i++) {
            // if(input != board.length) {
            //     System.out.println("Try again!");
            // } have to figure out the input validation...
            System.out.print("Player 1 - enter in your row: ");
            int row = input.nextInt();
            System.out.print("Player 1 - enter in your column: ");
            int col = input.nextInt();
            if(board[row][col] == player1 || board[row][col] == player2 ) {
                System.out.print("Player 1 - enter in your row: ");
                row = input.nextInt();
                System.out.print("Player 1 - enter in your column: ");
                col = input.nextInt();
            } else {
                board[row][col] = player1;
            }

            System.out.println(toString());
            if(checkRow(row, true) == true|| checkCol(col, true) == true || checkDiag(true) == true) {
                System.out.print("Winner!");
            } 
            System.out.print("Player 2 - enter in your row: ");
            int row2 = input.nextInt();
            System.out.print("Player 2 - enter in your column: ");
            int col2 = input.nextInt();
            if(board[row2][col2] == player1 || board[row2][col2] == player2 ) {
                System.out.print("Player 2 - enter in your row: ");
                row2 = input.nextInt();
                System.out.print("Player 2 - enter in your column: ");
                col2 = input.nextInt();
            } else {
                board[row2][col2] = player2;
            }
            System.out.println(toString());
            if(checkRow(row2, true) == true|| checkCol(col2, true) == true || checkDiag(true) == true) {
                System.out.println("Winner!");
            } 
        }
        input.close();
        
    }
    
    public String printInstructions(){
        String str = "";
        str += ("Welcome to TIC TAC TOE!" + "\n");
        str += ("To play you need to have your character make in a straight line, 3 in a row." + "\n");
        str += ("You'll start off by entering a row and column in order to decide where your player goes." + "\n");
        str += ("From top to bottom the row numbers are: 0, 1, 2." + "\n");
        str += ("From left to right the column numbers are: 0, 1, 2." + "\n");
        str += ("Enjoy!!" + "\n");
        return str;
    }

    public boolean checkRow(int n, boolean isPlayerX) {
        char player = '\0';
        if(isPlayerX == true) {
            player = 'X';
        } else{
            player = 'O';
        }
        char[] row = board[n];   

        for(int i = 0; i < row.length; i++) {
            if(row[i] != player){
                return false;
            }
        }
        return true;
    }

    public boolean checkCol(int n, boolean isPlayerX) {
        char player = '\0';
        if(isPlayerX == true) {
            player = 'X';
        } else {
            player = 'O';
        }
        for(int i = 0; i < board.length; i++) {
            if(board[i][n] != player) {
                return false;
            }
        }
        return true;
    }

    public boolean checkDiag(boolean isPlayerX) {
        char player = '\0';
        if(isPlayerX == true) {
            player = 'X';
        } else {
            player = 'O';
        }
        boolean diag1 = true;
        boolean diag2 = true;
        int j = board.length -1;
        for(int i = 0; i < board.length; i++) {
            if(board[i][j--] != player) {
                diag1 = false;
            } if(board[i][i] != player) {
                diag2 = false;
            } 
        }

        if(diag1 == true) {
            return diag1;
        } else {
            return diag2;
        }
         
  }

    @Override
    public String toString(){
        String returnStr = "";
        // returnStr += "[\n";
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[col].length - 1; col++){
                returnStr += board[row][col] + ", ";
            }
            returnStr += board[row][board[row].length - 1] + "\n";
        }
        // returnStr += "]";

        return returnStr;
    }
    
}
