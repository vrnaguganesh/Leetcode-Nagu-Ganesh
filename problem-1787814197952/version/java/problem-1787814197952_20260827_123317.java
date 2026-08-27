// Last updated: 8/27/2026, 12:33:17 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int l=0;
4        int r=height.length-1;
5        int ma=0;
6        while(l<r){
7            int h=Math.min(height[l],height[r]);
8            int w=r-l;
9            int a=h*w;
10            ma=Math.max(ma,a);
11            if(height[l]<height[r]){
12                l++;
13            }
14            else
15            r--;
16        }
17        // for(int l=0;l<height.length-1;l++){
18        //     for(int r=height.length-1;r>0;r--){
19        //          int h=Math.min(height[l],height[r]);
20        //          int w=r-l;
21        //          int a=h*w;
22        //          ma=Math.max(ma,a);
23        //     }
24        // }
25        return ma;
26    }
27}