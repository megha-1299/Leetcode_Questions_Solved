public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of the first n natural numbers
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num; // Sum of the numbers in the array
        }

        return expectedSum - actualSum; // The missing number
    }
}
