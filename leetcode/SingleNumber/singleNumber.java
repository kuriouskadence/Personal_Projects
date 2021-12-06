public class singleNumber {
    public int aloneNum(int[] nums){
        int[] circledIndices = new int[nums.length]; 
        int k = 0;
        for (int i = 0; i < nums.length - 2; i++){
            if (i == 0 || contains(circledIndices, i) == false) {
                for (int j = i + 1; j < nums.length; j++){
                    if (contains(circledIndices, j) == false ) {
                        if (nums[i] == nums[j]){
                            circledIndices[k++] = j;
                            break;
                        }
                        if (j == nums.length - 1) {
                            return nums[i];
                        }
                        
                    }
                }
            }   
        }

        return -1;
    }
    
    public boolean contains(int[] arr, int findNum){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == findNum){
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args){
        singleNumber oneNum = new singleNumber();
        System.out.println(oneNum.aloneNum(new int[] {1,2,4,5,3,2,4,1,3} ));
    }

}
