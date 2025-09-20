import java.util.Arrays;

public class Main {

    // Function to calculate the sum of prime numbers in the range [l, r]
    static int primeSum(int l, int r) {
        // Step 1: Create a boolean array to mark prime numbers
        // Initially assume all numbers are prime
        boolean[] isPrime = new boolean[r + 1];
        Arrays.fill(isPrime, true);

        // Step 2: 0 and 1 are not prime numbers
        isPrime[0] = isPrime[1] = false;

        // Step 3: Sieve of Eratosthenes
        // Iterate from 2 up to sqrt(r)
        for (int i = 2; i <= Math.sqrt(r); i++) {
            if (isPrime[i]) {
                // Mark all multiples of i as non-prime
                for (int j = i * i; j <= r; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 4: Calculate sum of primes in range [l, r]
        int sum = 0;
        for (int i = l; i <= r; i++) {
            if (isPrime[i]) {
                sum += i;  // add prime number to sum
            }
        }

        // Step 5: Return the total sum
        return sum;
    }
}

/*
📌 Revision Notes:
1. Use Sieve of Eratosthenes to mark primes up to r.
2. Initialize all numbers as prime → set 0 & 1 as false.
3. For each prime i (2 to sqrt(r)) → mark multiples of i as not prime.
4. After sieve, loop from l to r → add all numbers still marked prime.
5. Time Complexity: O(r log log r), Space: O(r).
*/
