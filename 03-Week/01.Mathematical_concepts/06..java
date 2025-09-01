//6.GCD
class Solution {
    public static int gcd(int a, int b) {
        // GCD using Euclidean Algorithm
        
        // Loop continues until b becomes 0
        while (b > 0) {
            int temp = b;   // Store current b (needed later for swapping)
            b = a % b;     // Update b as remainder of a divided by b
            a = temp;      // Update a as old b (move forward in algorithm)
        }
        
        // When b becomes 0, a will hold the GCD
        return a;   
    }
}
