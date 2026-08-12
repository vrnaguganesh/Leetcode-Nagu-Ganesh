// Last updated: 8/12/2026, 9:34:38 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] brr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]==target-nums[i] && i!=j){
                    brr[0]=i;
                    brr[1]=j;
                    break;
                }
            }
        }
        return brr;
    
    }
}