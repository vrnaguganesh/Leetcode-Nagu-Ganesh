// Last updated: 9/26/2026, 8:29:11 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        // int l=0;
4        // int[] arr={-1,-1};
5        // for(int r=0;r<nums.length;r++){
6
7        //     if(nums[r]==target){
8        //         if(l==0)
9        //         arr[0]=r;
10        //         arr[l]=r;
11        //         l++;
12        //     }
13        // }
14       
15        // return arr;
16        
17        int l=0;
18        int r=nums.length-1;
19        int f=-1;
20        int ls=-1;
21        while(l<=r){
22            int m=(l+r)/2;
23            if(nums[m]==target){
24                f=m;
25                r=m-1;
26            }
27            else if(nums[m]<target)
28            l=m+1;
29            else
30            r=m-1;
31        }
32        l=0;
33        r=nums.length-1;
34        while(l<=r){
35            int m=(l+r)/2;
36            if(nums[m]==target){
37                ls=m;
38                l=m+1;
39            }
40            else if(nums[m]<target)
41            l=m+1;
42            else
43            r=m-1;
44        }
45        return new int[]{f,ls};
46    }
47}