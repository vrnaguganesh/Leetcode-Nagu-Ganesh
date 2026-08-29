// Last updated: 8/29/2026, 6:47:29 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int c=0;
4        int p=1;
5        int l=0; 
6        if(k<=1){
7            return 0;
8        }
9        for(int r=0;r<nums.length;r++){
10            p=p*nums[r];
11            while(p>=k){
12                p=p/nums[l];
13                l++;
14            }
15            c=c+(r-l+1);
16        }
17
18        return c;
19    }
20}