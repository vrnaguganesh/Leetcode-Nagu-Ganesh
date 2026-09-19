// Last updated: 9/19/2026, 7:58:22 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int s=0;
4        int m=Integer.MIN_VALUE;
5        int t=0;
6        int m1=Integer.MAX_VALUE;
7        int q=0;
8        for(int i=0;i<nums.length;i++){
9            q+=nums[i];
10             s+=nums[i];
11              m=Math.max(m,s);
12            if(s<0){
13                s=0;
14            }
15           
16           
17            t+=nums[i];
18            if(t>0)
19            t=0;
20            
21            m1=Math.min(m1,t);
22        }
23        if(m<0)
24        return m;
25        else{
26        int p=q-m1;
27        m=Math.max(p,m);
28        return m;}
29    }
30}