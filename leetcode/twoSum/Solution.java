class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int k = i + 1; k < nums.length; k++){
                if(nums[i] + nums[k] == target){
                    int [] returnIndicies = {i, k};
                    return returnIndicies;
                }
            }
        }
        return nums;    
    }
}


