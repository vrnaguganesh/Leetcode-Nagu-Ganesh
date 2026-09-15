// Last updated: 9/15/2026, 4:09:24 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        // int[] arr=new int[nums.length];
4        // for(int i=0;i<nums.length;i++){
5        //     int m=1;
6        //     for(int j=0;j<nums.length;j++){
7        //         if(i == j) continue;
8        //         else{
9        //         m=m*nums[j];
10        //         arr[i]=m;
11        //         }
12        //     }   
13        // } 
14        // return arr; 
15        int[] p=new int[nums.length];
16        p[0]=1;
17        for(int i=1;i<nums.length;i++){
18            p[i]=p[i-1]*nums[i-1];
19        }
20        int r=1;
21        for(int i=p.length-1;i>=0;i--){
22            p[i]=p[i]*r;
23            r=r*nums[i];
24        }
25        return p;
26    }
27}