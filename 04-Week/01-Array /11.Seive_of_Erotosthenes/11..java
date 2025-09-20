class Solution {
    public int[] sieve(int n) {
        // Step 1: Create an array to mark primes (1 = prime, 0 = not prime)
        int[] prime = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = 1; // assume all numbers are prime initially
        }

        // 0 and 1 are not prime numbers
        prime[0] = 0;
        prime[1] = 0;
 
        // Step 2: Sieve process
        // Only need to check numbers up to sqrt(n)
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is still marked as prime
            if (prime[p] == 1) {
                // Mark all multiples of p as not prime
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = 0;
                }
            }
        }
 
        // Step 3: Count how many primes are found
        int count = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p] == 1)
                count++;
        }
 
        // Step 4: Store all prime numbers into a result array
        int[] res = new int[count];
        int index = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p] == 1)
                res[index++] = p;
        }
 
        // Step 5: Return the list of prime numbers
        return res;
    }
}

/*
📌 Revision Notes (Sieve of Eratosthenes):
1. Start by assuming all numbers are prime.
2. Mark 0 and 1 as not prime.
3. For each prime p (from 2 to sqrt(n)):
   - Mark multiples of p (p*p, p*p+p, ...) as not prime.
4. Collect all numbers still marked as prime into result.
5. Time Complexity: O(n log log n), Space: O(n).
*/
