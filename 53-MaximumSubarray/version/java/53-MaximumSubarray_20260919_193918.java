// Last updated: 9/19/2026, 7:39:18 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int s=0;
4        int m=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            
7            if(s<0){
8                s=0;
9            }
10            s+=nums[i];
11           m=Math.max(m,s);
12        }
13        return m;
14    }
15}