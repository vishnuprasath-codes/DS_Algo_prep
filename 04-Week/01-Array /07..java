class Solution {
    public int search(int arr[], int x) {
        // Traverse the array one element at a time
        for (int i = 0; i < arr.length; i++) {
            // If the current element matches the target 'x'
            if (arr[i] == x) {
                return i;  // Return its index immediately
            }
        }

        // If element not found after full traversal
        return -1;
    }
}

/*
📌 Revision Notes:
1. Loop through the array from index 0 to n-1.
2. If arr[i] == x → return i (element found).
3. If loop ends without match → return -1 (element not found).
4. This is Linear Search → O(n) time complexity.
*/
