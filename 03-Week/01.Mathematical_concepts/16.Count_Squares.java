//16.COUNT SQRT->https://www.geeksforgeeks.org/problems/count-squares3649/1
class Solution {
    static int countSquares(int n) {
        // The number of integers k such that k^2 < n
        // is simply floor(sqrt(n-1))
        return (int) Math.sqrt(n - 1);
    }
}
