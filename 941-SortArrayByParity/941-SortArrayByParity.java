// Last updated: 8/12/2026, 8:51:13 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }

        return nums;
    }
}