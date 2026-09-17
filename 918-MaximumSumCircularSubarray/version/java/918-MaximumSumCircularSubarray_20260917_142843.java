// Last updated: 9/17/2026, 2:28:43 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3    int min=Integer.MAX_VALUE;
4    int max=Integer.MIN_VALUE;
5    int minsum=0;
6    int maxsum=0;
7    int total=0;
8    int cir=0;
9    for(int i=0;i<nums.length;i++){
10        minsum+=nums[i];
11        min=Math.min(minsum,min);
12        if(minsum>0){
13            minsum=0;
14        }
15
16        maxsum+=nums[i];
17        max=Math.max(maxsum,max);
18        if(maxsum<0){
19            maxsum=0;
20        }
21
22        total+=nums[i];       
23    }
24    if(max<0){
25        return max;
26    }
27
28    cir=total-min;
29    cir=Math.max(cir,max);
30    return cir;
31    }
32}