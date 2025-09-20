// User function Template for Java
class Solution {
    // Function to find the maximum element from array arr1
    // and the minimum element from array arr2, then return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        // Assume first element of arr1 is the maximum initially
        int max = arr1[0];

        // Assume first element of arr2 is the minimum initially
        int min = arr2[0];

        // Traverse arr1 to find the maximum element
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];  // update maximum
            }
        }

        // Traverse arr2 to find the minimum element
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];  // update minimum
            }
        }

        // Return the product of maximum from arr1 and minimum from arr2
        return (long) min * max;
    }
}

/*
📌 Revision Notes:
1. Initialize max = arr1[0], min = arr2[0].
2. First loop → find maximum element in arr1.
3. Second loop → find minimum element in arr2.
4. Return min * max as long (to avoid overflow).
5. Time complexity = O(n + m), where n = arr1.length, m = arr2.length.
*/
