// Last updated: 8/27/2026, 4:30:09 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq=new int[256];
4        for(int ch:s.toCharArray()){
5            freq[ch]++;
6        }
7        for(int i=0;i<s.length();i++){
8            if(freq[s.charAt(i)]==1)
9            return i;
10            }
11            return -1;
12    }
13}