// Last updated: 8/27/2026, 9:16:37 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> res=new ArrayList<>();
5        for(int i=0;i<nums.length-2;i++){
6            if(i>0 && nums[i]==nums[i-1]){
7                continue;
8            }
9            int j=i+1;
10            int k=nums.length-1;
11            while(j<k){
12                int s=nums[i]+nums[j]+nums[k];
13                if(s==0){
14                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
15                    while(j<k && nums[j]==nums[j+1]){
16                        j++;
17                    }
18                    while(j<k && nums[k]==nums[k-1]){
19                        k--;
20                    }
21                    j++;
22                    k--;
23                }
24                else if(s>0){
25                    k--;
26                }
27                else
28                j++;
29            }
30        }
31       return res;
32    }
33}