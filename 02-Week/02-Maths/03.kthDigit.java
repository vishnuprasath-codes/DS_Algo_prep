/*problem link=[https://www.geeksforgeeks.org/problems/print-the-kth-digit3520/0]*/

class Solution {
    static long kthDigit(int a, int b, int k) {
        // code here
        long c =  (long) Math.pow(a, b);

        int count=0;
        while(c>0){
            long ld=c%10;
            c=c/10;
            count++;
            if(count==k){
                return ld;
            }
        }

        return -1;
    }
}
