// Last updated: 9/24/2026, 10:08:48 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3    int low=0;
4    int high=nums.length-1;
5    int ans=0;
6    while(low<high){
7        int mid=low+(high-low)/2;
8
9        if(nums[mid]<nums[mid+1]){
10           low=mid+1;
11        }
12        else
13        high=mid;
14    } 
15    return low;
16    }
17}