// Last updated: 8/27/2026, 9:24:05 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            for(int j=i+1;j<nums.length;j++){
5                if(nums[i]>nums[j]){
6                    int t=nums[i];
7                    nums[i]=nums[j];
8                    nums[j]=t;
9                }
10            }
11        }
12        System.out.print(Arrays.toString(nums)); 
13    }
14}