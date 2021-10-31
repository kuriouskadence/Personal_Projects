public class Solution {
	public int removeElement(int[] nums, int val) {
		int k = 0;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] != val) {
				k++;
			}
		}

		int index = 0;
		while (index < k) {
			if (nums[index] == val){
				for (int j = index; j < nums.length - 1; j++){
					int placeHolder = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = placeHolder;
				}
			} else {
				index++;
			}
		}

		return k;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int [] arr = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
		sol.removeElement(arr, 2);
	}
}
