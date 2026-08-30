// Last updated: 8/30/2026, 9:07:43 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        int l=0;
4        int c=0;
5        int r=0;
6        HashSet<Integer> s=new HashSet<>();
7        HashSet<Integer> s1=new HashSet<>();
8        while(r<nums.length){
9            if(r==0 || nums[r]!=nums[r-1]){
10                if(!s.contains(nums[r])){
11                    c++;
12                    s.add(nums[r]);
13                }
14                else if(!s1.contains(nums[r])){
15                    c--;
16                    s1.add(nums[r]);
17                }
18            }
19            r++;
20        }
21        return c;
22    }
23}