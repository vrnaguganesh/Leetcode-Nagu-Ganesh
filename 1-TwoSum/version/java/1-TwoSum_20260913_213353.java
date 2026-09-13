// Last updated: 9/13/2026, 9:33:53 PM
1class Solution {
2    public int[] twoSum(int[] nums, int t) {
3        // int[] brr=new int[2];
4        // for(int i=0;i<nums.length;i++){
5        //     for(int j=1;j<nums.length;j++){
6        //         if(nums[i]+nums[j]==target && i!=j){
7        //             brr[0]=i;
8        //             brr[1]=j;
9        //         }
10        //     }
11        // }
12        // return brr;
13        HashMap<Integer,Integer> m=new HashMap<>();
14        for(int i=0;i<nums.length;i++){
15            int h=t-nums[i];
16            if(m.containsKey(h)){
17                return new int[]{m.get(h),i};
18            }
19            m.put(nums[i],i);
20        }
21        return new int[]{};
22    }
23}