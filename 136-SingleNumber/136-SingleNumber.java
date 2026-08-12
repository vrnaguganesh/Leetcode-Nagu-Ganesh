// Last updated: 8/12/2026, 9:33:23 PM
class Solution {
    public int singleNumber(int[] nums) {
        int i,x=0;
        for(i=0;i<nums.length;i++){
            x=x^nums[i];
        }
        return x;
        
        
    }
}