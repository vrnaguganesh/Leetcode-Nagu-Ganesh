// Last updated: 9/30/2026, 2:29:55 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5
6        List<List<Integer>> ans = new ArrayList<>();
7
8        Arrays.sort(nums);
9
10        for (int i = 0; i < nums.length - 2; i++) {
11
12            // Skip duplicate first elements
13            if (i > 0 && nums[i] == nums[i - 1])
14                continue;
15
16            int left = i + 1;
17            int right = nums.length - 1;
18
19            while (left < right) {
20
21                int sum = nums[i] + nums[left] + nums[right];
22
23                if (sum == 0) {
24
25                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
26
27                    // Skip duplicate left values
28                    while (left < right && nums[left] == nums[left + 1])
29                        left++;
30
31                    // Skip duplicate right values
32                    while (left < right && nums[right] == nums[right - 1])
33                        right--;
34
35                    left++;
36                    right--;
37
38                } else if (sum < 0) {
39
40                    left++;
41
42                } else {
43
44                    right--;
45                }
46            }
47        }
48
49        return ans;
50    }
51}