// Last updated: 8/27/2026, 9:45:35 AM
1class Solution {
2    public void sortColors(int[] nums) {
3            int l=0;
4            int m=0;
5            int h=nums.length-1;
6            while(m<=h){
7                if(nums[m]==0){
8                    nums[m]=nums[l];
9                    nums[l]=0;
10                    l++;
11                    m++;
12                }
13                else if(nums[m]==1){
14                    m++;
15                }
16                else{
17                    int t=nums[m];
18                    nums[m]=nums[h];
19                    nums[h]=t;
20                    h--;
21                }
22            }
23
24        
25        System.out.print(Arrays.toString(nums));
26    }
27}