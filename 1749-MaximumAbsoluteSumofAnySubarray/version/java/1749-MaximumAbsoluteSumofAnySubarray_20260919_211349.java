// Last updated: 9/19/2026, 9:13:49 PM
1class Solution {
2    public int maxAbsoluteSum(int[] nums) {
3        int s=0;
4        int m=Integer.MIN_VALUE;
5        int t=0;
6        int m1=Integer.MAX_VALUE;
7        for(int i=0;i<nums.length;i++){
8            s+=nums[i];
9            m=Math.max(m,s);
10            if(s<0){
11                s=0;
12            }
13
14            t+=nums[i];
15            m1=Math.min(m1,t);
16            if(t>0)
17            t=0;
18        }
19        int p=Math.max(m,(Math.abs(m1)));
20        return p;
21    }
22}