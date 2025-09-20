// User function Template for Java
class Solution {
    public int nthFibonacci(int n) {
        // Base case 1: if n == 0 → return 0 (0th Fibonacci)
        if (n == 0) {
            return 0;
        }

        // Base case 2: if n == 1 → return 1 (1st Fibonacci)
        if (n == 1) {
            return 1;
        }

        // Recursive case:
        // fib(n) = fib(n-1) + fib(n-2)
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
}

/*
=============================
 Recursive Tree for n = 4
=============================

fib(4)
 ├── fib(3) + fib(2)
 │     ├── fib(2) + fib(1)
 │     │     ├── fib(1) → 1
 │     │     └── fib(0) → 0
 │     │        → fib(2) = 1
 │     └── fib(1) → 1
 │        → fib(3) = 2
 └── fib(2) + fib(1)
       ├── fib(1) → 1
       └── fib(0) → 0
          → fib(2) = 1

Final result: fib(4) = 3
--------------------------------

So the recursive calls expand like a tree:

fib(4)
 ├── fib(3)
 │     ├── fib(2)
 │     │     ├── fib(1)
 │     │     └── fib(0)
 │     └── fib(1)
 └── fib(2)
       ├── fib(1)
       └── fib(0)
*/
