// Last updated: 8/12/2026, 8:50:40 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int i,j;
     

        for(i=1;i<nums.length;i++){
           nums[i]=nums[i]+nums[i-1];
        }
                return nums;
        
    }
    
}
