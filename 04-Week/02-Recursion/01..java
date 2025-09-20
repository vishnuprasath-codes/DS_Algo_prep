public class vp {
    // Recursive function to print numbers from 1 to n
    static void printNumbers(int n) {
        // Base case: stop when n == 0
        if (n == 0) {
            return;
        }

        // Recursive call first (this goes "deep" to 1)
        printNumbers(n - 1);

        // Print after recursion (so numbers print in increasing order)
        System.out.println(n);
    }
}

/*
printNumbers(3)
 └── calls printNumbers(2)
       └── calls printNumbers(1)
             └── calls printNumbers(0) → base case (stop)
             └── print 1
       └── print 2
 └── print 3

*/
