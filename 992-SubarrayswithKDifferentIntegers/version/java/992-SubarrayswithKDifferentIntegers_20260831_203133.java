// Last updated: 8/31/2026, 8:31:33 PM
1class Solution {
2    public int subarraysWithKDistinct(int[] nums, int k) {
3        return atmost(nums,k)-atmost(nums,k-1);
4    }
5    public int atmost(int[] nums,int k){
6        HashMap<Integer,Integer> m=new HashMap<>();
7        int l=0;
8        int c=0;
9        for(int r=0;r<nums.length;r++){
10            if(m.containsKey(nums[r])){
11                m.put(nums[r],m.get(nums[r])+1);
12            }
13            else
14            m.put(nums[r],1);
15
16            while(m.size()>k){
17                m.put(nums[l],m.get(nums[l])-1);
18                if(m.get(nums[l])==0)
19                m.remove(nums[l]);
20                l++;
21            }
22            c+=r-l+1;
23        }
24        return c;
25    }
26}