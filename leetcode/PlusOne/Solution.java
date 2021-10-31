public class Main {
    public int[] plusOne(int[] digits) {
        digits[digits.length -1]++;
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] == 10 && i != 0){
                digits[i] = 0;
                digits[i - 1]++;
            }
            else if (digits[i] == 10 && i == 0){
                int[] newArr = new int[digits.length + 1];
                digits[i] = 0;
                newArr[0] = 1;
                for (int j = 1; j < newArr.length; j++){
                    newArr[j] = 0;
                }
                digits = newArr;
            }
            else {
                break;
            }
        } 
        String printArr = "[";
        for (int i = 0; i < digits.length; i++){
          printArr += " " + digits[i];
        }
        printArr += " ]";
        System.out.println(printArr);
        return digits;
    }
    

    public static void main(String[] args) {
        Main one = new Main();
        System.out.println(one.plusOne(new int[]{9}));
        
    }
}