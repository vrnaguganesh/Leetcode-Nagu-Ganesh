// Last updated: 8/12/2026, 8:50:19 AM
class Solution {
    public boolean isThree(int n) {
        int x = (int) Math.sqrt(n);
        
        // n must be a perfect square
        if (x * x != n) {
            return false;
        }
        
        // x must be prime
        if (x < 2) {
            return false;
        }
        
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        
        return true;
        
    }
}