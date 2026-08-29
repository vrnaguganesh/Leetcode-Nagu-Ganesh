// Last updated: 8/29/2026, 6:08:09 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left=0;
4        int zerocount=0;
5        int r=0;
6        for(r=0;r<nums.length;r++){
7            if(nums[r]==0){
8                zerocount++;
9            }
10            if(zerocount>k){
11                if(nums[left]==0){
12                    zerocount--;
13                }
14                left++;
15            }
16        }
17        return r-left;
18    }
19}