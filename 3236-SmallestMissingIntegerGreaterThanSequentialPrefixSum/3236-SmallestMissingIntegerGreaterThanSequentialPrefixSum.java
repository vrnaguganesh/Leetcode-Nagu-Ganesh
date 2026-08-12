// Last updated: 8/12/2026, 8:49:34 AM
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        // Find sum of longest sequential prefix
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1)
                sum += nums[i];
            else
                break;
        }

        // Find smallest missing number >= sum
        while (true) {
            boolean found = false;

            for (int num : nums) {
                if (num == sum) {
                    found = true;
                    break;
                }
            }

            if (!found)
                return sum;

            sum++;
        }
    }
}