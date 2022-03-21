public class LoShuMagic {
    int[][] square;
    public LoShuMagic() {
        this.square = new int[0][0];
    }

    public LoShuMagic(int[][] square ) {
        this.square = square;
    }

    public boolean checkMagicSquare() {
        int rows = checkRows();
        int cols = checkCols();
        int diags = checkDiags();
        if(rows == -1 || cols == -1 || diags == -1) {
            return false;
        }
        if(rows == cols && cols == diags) {
            return true;
        }

        return false;
    } 

    public int getRowSum(int rowNum) {
        int sum = 0;
        for( int i = 0; i < square[rowNum].length; i++ ) {
            sum += square[rowNum][i];
        }
        return sum;
    }

    public int getColSum(int colNum) {
        int sum = 0;
        for(int i = 0; i < square.length; i++) {
            sum += square[i][colNum];
        }
        return sum;
    }

    public int checkRows() {
        int sameSum = getRowSum(0);
        for(int row = 1; row < square.length; row++) {
            if(getRowSum(row) != sameSum) {
                return -1;
            }
        }
        return sameSum;
    }

    public int checkCols() {
        int sameSum = getColSum(0);
        for(int col = 1; col < square[0].length; col++) {
            if(getColSum(col) != sameSum) {
                return -1;
            }
        }
        return sameSum;
    }

    public int checkDiags() {
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        int indexDiag2 = square[0].length - 1;
        for(int i = 0; i < square[0].length; i++) {
            sumDiag1 += square[i][i];
            sumDiag2 += square[i][indexDiag2--];
        }
        if(sumDiag1 != sumDiag2) {
            return -1;
        }
        return sumDiag1;
    }

    @Override
    public String toString() {
        String rtnStr = "";
        if(checkMagicSquare() == true) {
            rtnStr += "This is a LoShuMagic Square!" + "\n";
        } else {
            rtnStr += "This is NOT a LoShuMagic Square!" + "\n";
        }

        for(int i = 0; i < square.length; i++) {
            for(int j = 0; j < square[i].length; j++) {
                rtnStr += "[ " + square[i][j] + " ]";
            }
            if(i != square.length - 1) {
                rtnStr += "\n";
            }
        }
        return rtnStr;
    }
    

}