//7.MIDDLE OF THREE->https://www.geeksforgeeks.org/problems/middle-of-three2926/1
// User function Template for Java

class Solution {
    int middle(int a, int b, int c) {
        // check if 'a' lies between 'b' and 'c'
        // case 1: a > b and a < c   (b < a < c)
        // case 2: a > c and a < b   (c < a < b)
        if ((a > b && a < c) || (a > c && a < b)) {
            return a;  // 'a' is the middle element
        }
        // check if 'b' lies between 'a' and 'c'
        // case 1: b > a and b < c   (a < b < c)
        // case 2: b > c and b < a   (c < b < a)
        else if ((b > a && b < c) || (b > c && b < a)) {
            return b;  // 'b' is the middle element
        }
        // if neither 'a' nor 'b' is in the middle,
        // then 'c' must be the middle element
        else {
            return c;
        }
    }
}
