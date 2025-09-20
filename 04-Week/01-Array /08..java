// User function Template for Java
class Solution {
    public static int findElementAtIndex(int key, int[] arr) {
        // Traverse indices from 0 up to 'key'
        for (int i = 0; i <= key; i++) {
            // When index matches the given key
            if (i == key) {
                return arr[i];  // Return the element at that index
            }
        }

        // If key is out of range (shouldn't normally happen if input is valid)
        return -1;
    }
}

/*
📌 Revision Notes:
1. The function returns the element at index = key.
2. Loop runs until i == key → then returns arr[i].
3. If index is invalid (>= arr.length), function returns -1.
⚡ Simplified version: You can directly return arr[key] if key is valid.
*/
