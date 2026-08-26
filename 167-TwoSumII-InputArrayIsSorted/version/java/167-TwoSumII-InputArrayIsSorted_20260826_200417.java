// Last updated: 8/26/2026, 8:04:17 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int l=0;
4        int r=numbers.length-1;
5        while(l<r){
6            if(numbers[l]+numbers[r]==target){
7               return new int[]{l+1,r+1};
8            }
9            else if(numbers[l]+numbers[r]>target){
10                r--;
11            }
12            else
13            l++;
14        }
15        return new int[]{-1,-1};
16    }
17}