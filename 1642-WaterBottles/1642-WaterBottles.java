// Last updated: 8/12/2026, 8:50:36 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles; // start by drinking all full bottles
        int emptyBottles = numBottles; // they become empty
        
        while (emptyBottles >= numExchange) {
            int newFull = emptyBottles / numExchange; // exchange empty bottles for full
            totalDrank += newFull; // drink the new full bottles
            emptyBottles = emptyBottles % numExchange + newFull; // remaining empty bottles
        }
        
        return totalDrank;
    }
}