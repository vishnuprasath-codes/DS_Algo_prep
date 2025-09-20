// User function Template for Java
class Solution {
    int arraySum(int arr[]) {
        // Initialize a variable to store the sum of elements
        int sum = 0;

        // Loop through the array elements
        // NOTE: use < arr.length, because array index starts at 0 and goes till length-1
        for (int i = 0; i < arr.length; i++) {
            // Add each element to sum
            sum += arr[i];
        }

        // Return the final sum
        return sum;
    }
}
