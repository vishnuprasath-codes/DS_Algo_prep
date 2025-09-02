//4.CHECK PRIME NUMBER->https://www.geeksforgeeks.org/problems/prime-number2314/1
class Solution {
    static boolean isPrime(int n) {
        // Prime numbers must be greater than 1
        if (n <= 1) {
            return false;
        }

        // Loop from 2 to √n
        // If n has a factor larger than √n,
        // then it must also have a smaller factor already checked
        for (int i = 2; i * i <= n; i++) {
            // If n is divisible by i, then it's not prime
            if (n % i == 0) {
                return false;
            }
        }

        // If no divisors found, n is prime
        return true;
    }
}
