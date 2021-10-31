public class Solution{
    public int reverseNum(int origNum, int revNum){

        if (origNum == 0){
            return revNum / 10;
        }
        int lastDigit = origNum % 10;
        revNum = (revNum + lastDigit) * 10;

        return reverseNum(origNum / 10, revNum);
    }

    public boolean checkPalInt(int num){
        return num == reverseNum(num, 0);
    }




    public static void main(String[] args) {
        Solution pal = new Solution();
        System.out.println(pal.checkPalInt(123321));

    }
}