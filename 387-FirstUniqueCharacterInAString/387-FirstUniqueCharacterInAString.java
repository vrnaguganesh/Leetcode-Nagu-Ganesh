// Last updated: 8/12/2026, 9:31:37 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[256];
        for(int ch:s.toCharArray()){
            freq[ch]++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]==1)
            return i;
            }
            return -1;
    }
}