//17.PRINT ARRAY ELEMENTS-> https://www.geeksforgeeks.org/problems/print-elements-of-array4910/1
// User function Template for Java

class Solution {
    // Function to print all elements of the array, space-separated
    void printArray(int arr[]) {
        // Loop runs from index 0 (first element) to arr.length-1 (last element)
        for (int i = 0; i < arr.length; i++) {
            // Print the current element followed by a space
            // System.out.print() is used (not println) so elements stay on the same line
            System.out.print(arr[i] + " ");
        }
        // No println here, because the problem states:
        // "Don't move to the next line after printing"
    }
}
