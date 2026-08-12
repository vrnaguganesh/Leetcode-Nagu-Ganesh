// Last updated: 8/12/2026, 9:32:08 PM
class Solution {
    public int missingNumber(int[] nums) {
        int d=0;
        Arrays.sort(nums);
        if(nums[0]!=0)
        return 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1])
             return nums[i]+1;
        }
        return nums.length;
    }
}