// Last updated: 9/16/2026, 9:31:17 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=nums[0];
4        int min =nums[0];
5        int ans=nums[0];
6        int n=nums.length;
7        for(int i=1;i<n;i++){
8            int a=max*nums[i];
9            int b=min*nums[i];
10            max=Math.max(nums[i],Math.max(a,b));
11            min=Math.min(nums[i],Math.min(a,b));
12            ans=Math.max(ans,max);
13        }
14        return ans;
15    }
16}