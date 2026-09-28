// Last updated: 9/28/2026, 2:20:56 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3
4       
5        s=s.trim().toLowerCase();
6        String str = "";
7        for(char ch : s.toCharArray()){
8            if(Character.isLetterOrDigit(ch)){
9                str+=ch;
10            }
11        }
12
13        String rev=new StringBuilder(str).reverse().toString();
14        if(rev.equals(str)){
15            return true;
16        }
17        return false;
18    }
19}