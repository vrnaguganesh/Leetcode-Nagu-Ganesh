// Last updated: 8/12/2026, 9:32:33 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(i!=j){
        //             if(nums[i]==nums[j])
        //             return true;
        //         }
        //     }
        // }
        // return false;


        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
           
            if(s.contains(nums[i])){
                return true;
            }
            else
            s.add(nums[i]);
        }
        return false;
    }
}