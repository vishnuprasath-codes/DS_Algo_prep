/*problem mink=[https://www.geeksforgeeks.org/problems/count-digits-1606889545/1]*/

class Solution {
    public int countDigits(int n) {
        // code here
        int count=0;
        while(n>0){
            int ld=n%10;
            n=n/10;
            count++;
        }return count;
    }
}
