// Last updated: 9/15/2026, 9:34:24 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer> m=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            if(m.containsKey(nums[i]))
6            m.put(nums[i],m.get(nums[i])+1);
7            else
8            m.put(nums[i],1);
9        }
10        Integer[] arr=m.keySet().toArray(new Integer[0]);
11        Arrays.sort(arr,(a,b) -> m.get(b)-m.get(a));
12        int[] ans=new int[k];
13        for(int i=0;i<k;i++){
14            ans[i]=arr[i];
15        }
16        return ans;
17    }
18}