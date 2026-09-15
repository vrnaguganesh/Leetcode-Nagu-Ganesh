// Last updated: 9/15/2026, 8:16:33 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] p=new int[nums.length];
4        p[0]=1;
5        for(int i=1;i<nums.length;i++){
6            p[i]=nums[i-1]*p[i-1];
7        }
8        int r=1;
9        for(int i=p.length-1;i>=0;i--){
10            p[i]=p[i]*r;
11            r=r*nums[i];
12        }
13        return p;
14
15    }
16}