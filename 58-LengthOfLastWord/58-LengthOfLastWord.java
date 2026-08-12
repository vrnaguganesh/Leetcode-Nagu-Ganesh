// Last updated: 8/12/2026, 9:34:02 PM
class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr=s.toCharArray();
        int c=0,a=0;
        for(int i=s.length()-1;i>=0;i--){
            if(arr[i]!=' '){
            c=i;
            break;}
        }
        for(int i=c;i>=0&&arr[i]!=' ';i--){
            a++;
        }
        return a;
        
    }
}