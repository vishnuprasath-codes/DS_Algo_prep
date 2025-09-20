class Solution {
    public static boolean isPerfect(int[] arr) {
        // Find the size of the array
        int n = arr.length;

        // Traverse only half of the array
        // Compare elements from start and end
        for (int i = 0; i < n / 2; i++) {
            // If mismatch found (left != right), it's not perfect
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }

        // If all pairs matched, array is perfect (palindrome)
        return true;
    }
}

/*
📌 Revision Notes:
1. Perfect array = same when read from front and back.
   Example: [1, 2, 3, 2, 1] ✅
2. Compare arr[i] with arr[n-1-i] for each i.
3. If any mismatch → return false immediately.
4. If loop completes → return true.
5. Time Complexity: O(n/2) ≈ O(n).
*/
