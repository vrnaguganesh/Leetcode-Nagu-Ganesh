// Last updated: 8/12/2026, 8:51:34 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = 0;
        int missing = 0;

        for (int i = 1; i <= nums.length; i++) {
            int count = 0;

            for (int num : nums) {
                if (num == i)
                    count++;
            }

            if (count == 2)
                duplicate = i;
            else if (count == 0)
                missing = i;
        }

        return new int[]{duplicate, missing};
    }
}