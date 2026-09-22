// Last updated: 9/22/2026, 10:21:39 PM
1class Solution {
2    public int search(int[] nums, int t) {
3        int l=0;
4        int r=nums.length-1;
5       if(nums.length==1){
6        if(nums[0]==t)
7        return 0;
8        else
9        return -1;
10       }
11        while(l<=r ){
12            int m=l+(r-l)/2;
13            if(nums[m]==t)
14            return m;
15            else if(t>nums[m]){
16                l=m+1;
17            }
18            else
19            r=m-1;
20            
21        }
22        return -1;
23    }
24}