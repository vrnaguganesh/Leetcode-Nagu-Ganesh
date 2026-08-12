// Last updated: 8/12/2026, 9:32:03 PM
class Solution {
    public void moveZeroes(int[] nums) {
        // int c=0,i,j;
        // for(i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //     nums[c]=nums[i];
        //     c++;
        // }
        // }
        //  for(j=c;j<nums.length;j++){
        //     nums[j]=0;
        //  }
        //  System.out.print(nums);
        int t;
        int [] brr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==0 && nums[j]!=0){
                    t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
                brr[i]=nums[i];
                brr[j]=nums[j];
            }
        }
        System.out.print(Arrays.toString(brr));

    }
}