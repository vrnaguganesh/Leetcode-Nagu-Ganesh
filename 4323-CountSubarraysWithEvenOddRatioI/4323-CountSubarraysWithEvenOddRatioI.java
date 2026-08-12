// Last updated: 8/12/2026, 8:49:16 AM
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int e=0;
            int o=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0)
                    e++;
                else
                    o++;
                if(e*b<=a*o)
                    c++;
            }
        }
        return c;
    }
}