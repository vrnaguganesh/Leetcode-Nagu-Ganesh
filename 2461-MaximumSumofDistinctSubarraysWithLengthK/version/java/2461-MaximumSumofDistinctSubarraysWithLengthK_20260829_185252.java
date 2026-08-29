// Last updated: 8/29/2026, 6:52:52 PM
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        HashSet<Integer> st=new HashSet<>();
4        int l=0;
5        long s=0;
6        long ms=0;
7        for(int r=0;r<nums.length;r++){
8            while(st.contains(nums[r])){
9                st.remove(nums[l]);
10                s-=nums[l];
11                l++;
12            }
13            st.add(nums[r]);
14            s+=nums[r];
15            if(r-l+1>k){
16                  st.remove(nums[l]);
17                s-=nums[l];
18                l++;
19            }
20            if(r-l+1==k)
21            ms=Math.max(s,ms);
22        }
23        return ms;
24    }
25}