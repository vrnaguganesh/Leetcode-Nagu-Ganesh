// Last updated: 8/12/2026, 9:31:45 PM
class Solution {
    public void reverseString(char[] s) {
        int i;
        String s1="";
        // char arr[]=s1.toCharArray();

        for(i=s.length-1;i>=0;i--){
            s1+=s[i];
        }
        
         for(i=0;i<s.length;i++){
            s[i]=s1.charAt(i);
         }
        
        
    }
}