// Last updated: 8/12/2026, 8:51:27 AM
class Solution {
    public int search(int[] nums, int target) {
        int low=0,n=nums.length;
        int high=n-1;
        int flag=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
           
                return mid;
            }
            else if(nums[mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
    
        return -1;
    }
}