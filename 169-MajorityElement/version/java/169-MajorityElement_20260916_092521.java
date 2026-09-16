// Last updated: 9/16/2026, 9:25:21 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3         int w=0;
4      int r=0;
5        HashMap<Integer,Integer> m=new HashMap<>();
6        for(int i=0;i<nums.length;i++){
7            if(m.containsKey(nums[i]))
8            m.put(nums[i],m.get(nums[i])+1);
9            else
10            m.put(nums[i],1);
11           
12            for(int k:m.keySet()){
13                if(m.get(k)>w){
14                    w=m.get(k);
15                    r=k;
16                }
17                //r=Math.max(k,r);
18            }      
19        }
20        return r;
21    }
22}