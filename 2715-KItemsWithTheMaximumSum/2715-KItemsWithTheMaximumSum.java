// Last updated: 8/12/2026, 8:49:50 AM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
           // Pick as many 1s as possible
        int onesToTake = Math.min(numOnes, k);
        k -= onesToTake;
        
        // Pick as many 0s as possible
        int zerosToTake = Math.min(numZeros, k);
        k -= zerosToTake;
        
        // Any remaining k must be -1s
        int negOnesToTake = Math.min(numNegOnes, k);
        
        // Maximum sum = sum of 1s minus sum of -1s (0s do not affect sum)
        return onesToTake - negOnesToTake;
    }
}