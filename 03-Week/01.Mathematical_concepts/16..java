//16.COUNT SQRT
class Solution {
    static int countSquares(int n) {
        // The number of integers k such that k^2 < n
        // is simply floor(sqrt(n-1))
        return (int) Math.sqrt(n - 1);
    }
}
