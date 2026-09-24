// Last updated: 9/24/2026, 10:02:31 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3    int max=Integer.MIN_VALUE;
4    int x=0;
5    for(int i=0;i<nums.length;i++){
6       if(nums[i]>max){
7        max=nums[i];
8        x=i;
9       }
10     }
11     return x;
12    }
13}