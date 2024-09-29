public class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x; // 0 or 1, their square roots are themselves
        }

        int left = 2, right = x / 2; // Search between 2 and x/2
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow
            long midSquared = (long) mid * mid; // Use long to avoid overflow

            if (midSquared == x) {
                return mid; // Found the exact square root
            } else if (midSquared < x) {
                left = mid + 1; // Move to the upper half
            } else {
                right = mid - 1; // Move to the lower half
            }
        }

        return right; // The floor of the square root
    }
}
