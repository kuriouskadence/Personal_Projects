
public class Solution {
   
    public int thirdMaxNum(int [] nums) {
        int [] maxes = new int [0];
        while (nums.length > 0 && maxes.length < 3) {
            int max = findMax(nums);
            nums = removeMax(nums, max);
            maxes = addMax(maxes, max);
        }

        if (maxes.length != 3) {
            return maxes[0];
        } else {
            return maxes[2];
        }
    }

    
    public int findMax(int [] lookNums) {
        int max = lookNums[0];
        for (int i = 1; i < lookNums.length; i++) {
            if (lookNums[i] > max) {
                max = lookNums[i];
            }
        } 
        return max;
    }

    public int [] removeMax(int [] ogArr, int max) {
        int maxOccurances = countDups(ogArr, max);
        int [] revMax = new int [ogArr.length - maxOccurances];
        int currIndexRevMax = 0;
        for (int i = 0; i < ogArr.length; i++) {
            if (ogArr[i] != max) {
                revMax[currIndexRevMax] = ogArr[i];
                currIndexRevMax++;
            }
        }
        return revMax;
    }

    public int [] addMax(int [] maxesArr, int max ) {
        int [] plusMax = new int [maxesArr.length + 1];
        for (int i = 0; i < maxesArr.length; i++) {
            plusMax[i] = maxesArr[i];
        }
        plusMax[plusMax.length - 1] = max;
        return plusMax;
    }

    public boolean contains(int [] maxes, int max) {
        for (int i = 0; i < maxes.length; i++) {
            if (maxes[i] == max) {
                return true;
            }
        }
        return false;
    }

    public int countDups(int [] arr, int num) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                counter++;
            }
        }
        return counter;
    }

    public static String arrToString(int [] arr) {
        String returnStr = "[ ";
        for (int i = 0; i < arr.length; i++) {
            returnStr += arr[i] + " ";
        }
        returnStr += "]";
        return returnStr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int [] nums0 = new int[]{2, 2, 3, 1};
        int [] nums1 = new int[]{3, 2, 1};
        int [] nums2 = new int[]{1,2};
        int [][] nums = new int [][]{nums0, nums1, nums2};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(sol.thirdMaxNum(nums[i]));
        }
        // int max = sol.findMax(nums);
        // System.out.println(max);
        // System.out.println(arrToString(sol.removeMax(nums, max)));
        // System.out.println(arrToString(sol.addMax(nums, 10)));
    }




}
