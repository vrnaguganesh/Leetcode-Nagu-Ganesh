// Last updated: 8/26/2026, 7:34:17 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int l=0;
4        int r=0;
5        while(r<nums.length){
6            if(nums[r]!=0){
7                int t=nums[l];
8                nums[l]=nums[r];
9                nums[r]=t;
10                l++;
11            }
12            r++;
13        }
14        // for(int r=0;r<nums.length;r++){
15        //     if(nums[r]!=0){
16        //         int t=nums[l];
17        //         nums[l]=nums[r];
18        //         nums[r]=t;
19        //         l++;
20        //     }
21           
22        // }
23        System.out.print(Arrays.toString(nums));
24    }
25}