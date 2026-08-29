// Last updated: 8/29/2026, 5:21:04 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int m=0;
4        int l=0;
5        for(int i=0;i<nums.length;i++){
6          if(nums[i]==1){
7            l++;
8            m=Math.max(m,l);
9          }        
10          else{
11            l=0;
12          }
13        }
14        return m;
15    }
16}