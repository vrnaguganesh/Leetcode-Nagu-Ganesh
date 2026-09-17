// Last updated: 9/17/2026, 2:13:21 PM
1class Solution {
2    public int maxAbsoluteSum(int[] nums) {
3    int maxsum=0;
4    int minsum=0;
5    int min =Integer.MAX_VALUE;
6    int max =Integer.MIN_VALUE;
7    int ans=0;
8    for(int i=0;i<nums.length;i++){
9        maxsum+=nums[i];
10
11        max=Math.max(maxsum,max);
12        if(maxsum<0){
13            maxsum=0;
14        }
15
16        minsum+=nums[i];
17        if(minsum>0){
18            minsum=0;
19        }
20         min=Math.min(minsum,min);
21    }
22    ans=Math.max(max,-min);
23    return ans;
24    }
25}