// Last updated: 8/12/2026, 8:49:39 AM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
          int distance = 0;
        int used = 0;

        while (mainTank > 0) {
            // Use 1 liter
            mainTank--;
            distance += 10;
            used++;

            // Every 5 liters used, inject 1 liter if possible
            if (used % 5 == 0 && additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }

        return distance;
    }
}