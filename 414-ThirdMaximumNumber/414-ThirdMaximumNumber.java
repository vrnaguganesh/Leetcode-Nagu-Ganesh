// Last updated: 8/12/2026, 8:51:50 AM
class Solution {
    public int thirdMax(int[] nums) {
        Integer m1 = null;
        Integer m2 = null;
        Integer m3 = null;

        // Find first maximum
        for (int num : nums) {
            if (m1 == null || num > m1) {
                m1 = num;
            }
        }

        // Find second distinct maximum
        for (int num : nums) {
            if (num != m1 && (m2 == null || num > m2)) {
                m2 = num;
            }
        }

        // Find third distinct maximum
        for (int num : nums) {
            if (m2 != null && num != m1 && num != m2 &&
                (m3 == null || num > m3)) {
                m3 = num;
            }
        }

        return (m3 == null) ? m1 : m3;
    }
}