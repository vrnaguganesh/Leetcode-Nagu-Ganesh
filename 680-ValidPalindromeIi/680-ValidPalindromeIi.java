// Last updated: 8/12/2026, 8:51:31 AM
class Solution {
    public boolean validPalindrome(String s) {
        char arr[]=s.toCharArray();
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return check(s,left+1,right)|| check(s,left,right-1);
            }
            left++;
            right--;

        }
        return true;
    }
     public boolean check(String s,int left,int right) {
         while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
               return false;
            }
            left++;
            right--;

        }
        return true;
    }

     
       
    }
