// Last updated: 8/12/2026, 9:32:56 PM
class Solution {
    public String convertToTitle(int n) {
        // String l="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder s=new StringBuilder();
        while(n>0){
            n--;
            int r=n%26;
            s.append((char)('A'+r));
            n=n/26;
        }
        return(s.reverse().toString());
    }
}