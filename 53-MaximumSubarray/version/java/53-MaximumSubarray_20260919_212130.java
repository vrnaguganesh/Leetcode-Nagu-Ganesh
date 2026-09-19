// Last updated: 9/19/2026, 9:21:30 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int s=0;
4        int m=Integer.MIN_VALUE;
5        int t=0;
6        int m1=Integer.MIN_VALUE;
7        for(int i=0;i<nums.length;i++){
8            s+=nums[i];
9            m=Math.max(s,m);
10            if(s<0)
11            s=0;
12
13            // t+=nums[i];
14            // m1=Math.min(t,m1);
15            // if(t>0)
16            // t=0;
17        }
18        return m;
19
20    }
21}