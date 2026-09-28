// Last updated: 9/28/2026, 2:17:23 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        s=s.trim().toLowerCase();
4        String str = "";
5        for(char ch : s.toCharArray()){
6            if(Character.isLetterOrDigit(ch)){
7                str+=ch;
8            }
9        }
10
11        int l = 0;
12        int r = str.length()-1;
13
14        while(l<r){
15            if(str.charAt(l) != str.charAt(r)){
16                return false;
17            }
18            l++;
19            r--;
20        }
21        return true;
22    }
23}