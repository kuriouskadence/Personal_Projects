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

    // public String toString(){
    //     String returnStr = "";
    //     returnStr += "this is da board: " + print2DArr(board);
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
        for(int row = 0; i < array.length; i++) {
            
        }
        System.out.print("]");
    }
    
}
