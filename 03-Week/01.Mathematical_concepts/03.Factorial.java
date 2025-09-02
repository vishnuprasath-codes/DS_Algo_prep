//3.FACTORIAL->https://www.geeksforgeeks.org/problems/factorial5739/1
class Solution {
    static int factorial(int n) {
        // Initialize factorial result as 1
        // (since multiplying by 1 doesn't change the value)
        int fact = 1;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // Multiply current number 'i' with fact
            fact = fact * i;
        }

        // Return the final factorial value
        return fact;
    }
}

