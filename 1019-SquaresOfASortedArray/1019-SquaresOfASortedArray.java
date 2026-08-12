// Last updated: 8/12/2026, 8:51:04 AM
import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        // int[] brr=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     // int t=0;
        //    int t=nums[i]*nums[i];
        //     brr[i]=t;
        // }
        //  Arrays.sort(brr);
        //  return brr;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<i+1;j++){
                int t=nums[i]*nums[i];
                int n=nums[j]*nums[j];
                nums[i]=t;
                nums[j]=n;
                if(nums[i]>nums[j]){
                    int k=nums[i];
                    nums[i]=nums[j];
                    nums[j]=k;
                }
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}