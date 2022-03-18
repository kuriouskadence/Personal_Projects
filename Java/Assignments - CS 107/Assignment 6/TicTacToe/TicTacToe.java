public class TicTacToe {
    int n;
    char[][] board;

    public TicTacToe(int n, char[][] board){
        this.n = n;
        this.board = board;
    }

    public TicTacToe(){
        int n = 3;
        this.board = new char[n][n];
    }

    public void setA(char[][] array){
        this.board = array;
    }

    public char[][] getBoard() {
        return board;
    }

    public boolean checkRow(int n, boolean isPlayerX) {
        char player = 'X';
        if(player != 'X') {
            isPlayerX = false;
        }
        return isPlayerX;

        for(int i = 0;)
    }





    // public String toString(){
    //     String returnStr = "";
    //     returnStr += ""
    //     return returnStr;
    // }

    public void printArr(int[] array) {
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }

    public void print2DArr(char[][] array) {
        System.out.print("[ ");
        for(char col = 0; col < array.length; col++) {
            for(char row = 0; row < array[col].length - 1; row++){
                System.out.print(array[col][row] + ", ");
            }
            System.out.println(array[col][array[col].length - 1]);
        }
        System.out.print("]");
        
    }


    
}
