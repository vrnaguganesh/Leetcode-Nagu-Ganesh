// Last updated: 9/26/2026, 7:47:27 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3    // int low=0;
4    // int high=nums.length-1;
5    // int ans=0;
6    // while(low<high){
7    //     int mid=low+(high-low)/2;
8
9    //     if(nums[mid]<nums[mid+1]){
10    //        low=mid+1;
11    //     }
12    //     else
13    //     high=mid;
14    // } 
15    // return low;
16
17    int l=0;
18    int m=0;
19    int s=0;
20    for(int r=1;r<nums.length;r++){
21        if(nums[r]>nums[l]){
22            m=Math.max(m,nums[r]);
23            s=Math.max(s,r);
24        }
25        l++;
26    }
27    return s;
28    }
29}