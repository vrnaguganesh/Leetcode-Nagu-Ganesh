// Last updated: 8/26/2026, 7:23:38 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int l=0;
4        for(int r=0;r<nums.length;r++){
5            if(nums[r]!=0){
6                int t=nums[l];
7                nums[l]=nums[r];
8                nums[r]=t;
9                l++;
10            }
11           
12        }
13        System.out.print(Arrays.toString(nums));
14    }
15}