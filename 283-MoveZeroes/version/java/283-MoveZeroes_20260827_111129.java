// Last updated: 8/27/2026, 11:11:29 AM
1// class Solution {
2//     public void moveZeroes(int[] nums) {
3//         int l=0;
4//         int r=0;
5//         while(r<nums.length){
6//             if(nums[r]!=0){
7//                 int t=nums[l];
8//                 nums[l]=nums[r];
9//                 nums[r]=t;
10//                 l++;
11//             }
12//             r++;
13//         }
14        // for(int r=0;r<nums.length;r++){
15        //     if(nums[r]!=0){
16        //         int t=nums[l];
17        //         nums[l]=nums[r];
18        //         nums[r]=t;
19        //         l++;
20        //     }
21           
22        // }
23        //System.out.print(Arrays.toString(nums));
24//     }
25// }
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45class Solution {
46    public void moveZeroes(int[] nums) {
47        int ind =0;
48        int n = nums.length;
49        for(int i=0;i<n;i++)
50        {
51            if(nums[i]!=0){
52                nums[ind++] = nums[i];
53            }
54        }
55        while(ind<n)
56        {
57            nums[ind++] = 0;
58        }
59    }
60}