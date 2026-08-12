// Last updated: 8/12/2026, 8:50:02 AM
class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        int t = time % cycle; // time within the current cycle
        
        if (t < n - 1) {
            // moving forward
            return 1 + t;
        } else {
            // moving backward
            return n - (t - (n - 1));
        }
    }
}