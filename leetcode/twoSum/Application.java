public class Application {


    public static String arrTostring(int[] arr) {
        String returnStr = "[ ";
        for(int i = 0; i < arr.length; i++) {
            returnStr += arr[i] + ", ";
        }
        returnStr += "]";
        return returnStr;
    }

    public static void main(String[] args) {
        Solution sum = new Solution();
        int [] nums = {2, 7 , 11, 15};
        int target = 9;
        System.out.println(arrTostring(sum.twoSum(nums, target)));
    }
    
}
