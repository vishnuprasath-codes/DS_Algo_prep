/*problem link=[https://www.geeksforgeeks.org/problems/corner-digits1317/1]*/

class Solution {
    public int corner_digitSum(int n) {
        // code here
        if (n < 10) return n;
        
        int ld = n % 10;  // last digit
        int fd = 0;       // first digit

        while (n > 0) {
            fd = n % 10; // updates until the first digit remains
            n = n / 10;
        }

        return ld + fd;
    }
}
