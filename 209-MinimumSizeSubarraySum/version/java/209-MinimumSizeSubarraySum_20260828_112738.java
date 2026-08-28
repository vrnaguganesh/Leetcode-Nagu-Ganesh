// Last updated: 8/28/2026, 11:27:38 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int sum=0;
4        int min =Integer.MAX_VALUE;
5        int left=0;
6        for(int i=0;i<nums.length;i++){
7            sum+=nums[i];
8           while(sum>=target){
9                sum-=nums[left];
10                min=Math.min(min,i-left+1);
11                left++;
12            }
13        }
14        if(min==Integer.MAX_VALUE)
15        return 0;
16        else
17        return min;
18    }
19}