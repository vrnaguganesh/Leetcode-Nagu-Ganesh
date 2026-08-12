// Last updated: 8/12/2026, 8:49:29 AM
class Solution {
    static final long MOD = 1_000_000_007L;

    public int maxTotalValue(int[] value, int[] decay, int m) {
        int n = value.length;

        long low = 1, high = 1_000_000_000L;
        long threshold = 0;

        while (low <= high) {
            long mid = (low + high) >>> 1;

            if (count(value, decay, mid) >= m) {
                threshold = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long totalCount = 0;
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            long v = value[i];
            long d = decay[i];

            if (v < threshold) continue;

            long cnt = (v - threshold) / d + 1;

            totalCount += cnt;

            long last = v - (cnt - 1) * d;

            totalSum += cnt * (v + last) / 2;
            totalSum %= MOD;
        }

        long extra = totalCount - m;

        totalSum = (totalSum - (extra % MOD) * (threshold % MOD)) % MOD;

        if (totalSum < 0) totalSum += MOD;

        return (int) totalSum;
    }

    private long count(int[] value, int[] decay, long x) {
        long cnt = 0;

        for (int i = 0; i < value.length; i++) {
            long v = value[i];
            long d = decay[i];

            if (v >= x) {
                cnt += (v - x) / d + 1;
            }
        }

        return cnt;
    }
}