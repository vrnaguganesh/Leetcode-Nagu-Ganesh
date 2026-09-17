// Last updated: 9/17/2026, 1:57:42 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3      int sum=0;
4      int max=Integer.MIN_VALUE;
5      int min=Integer.MAX_VALUE;
6      for(int i=0;i<nums.length;i++)  
7      {
8        sum+=nums[i];
9         max=Math.max(sum,max);
10        if(sum<0){
11            sum=0;
12        }
13       
14
15      }
16        return max;
17    }
18}