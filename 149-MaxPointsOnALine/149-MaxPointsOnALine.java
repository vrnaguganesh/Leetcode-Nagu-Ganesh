// Last updated: 8/12/2026, 9:33:06 PM
import java.util.*;

class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if (n <= 2)
            return n;

        int max = 0;

        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();

            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                int gcd = gcd(Math.abs(dx), Math.abs(dy));

                dx /= gcd;
                dy /= gcd;

                // Keep slope in one standard form
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }

                if (dx == 0)
                    dy = 1;

                if (dy == 0)
                    dx = 1;

                String slope = dx + "/" + dy;

                map.put(slope, map.getOrDefault(slope, 0) + 1);

                max = Math.max(max, map.get(slope) + 1);
            }
        }

        return max;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}