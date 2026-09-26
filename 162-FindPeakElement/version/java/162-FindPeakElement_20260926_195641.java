// Last updated: 9/26/2026, 7:56:41 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int l=0;
4        int r=nums.length-1;
5        while(l<r){
6            int m=(l+r)/2;
7            if(nums[m]<nums[m+1]){
8                l=m+1;
9            }
10            else
11            r=m;
12        }
13        return r;
14    }
15}