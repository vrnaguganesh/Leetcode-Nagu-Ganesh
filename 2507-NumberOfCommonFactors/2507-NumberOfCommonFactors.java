// Last updated: 8/12/2026, 8:50:05 AM
class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int limit = Math.min(a, b); // no factor can be larger than the smaller number
        for (int i = 1; i <= limit; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}