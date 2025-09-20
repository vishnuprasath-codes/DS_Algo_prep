import java.util.ArrayList;

class Solution {
    // Function to return alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Find the size of the array
        int n = arr.length;

        // Create an ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();

        // Traverse the array with step size = 2
        // (i = 0, 2, 4, ...) → picks alternate elements
        for (int i = 0; i < n; i += 2) {
            result.add(arr[i]); // Add the element at index i
        }

        // Return the list containing alternate elements
        return result;
    }
}

/*
📌 Revision Notes:
1. We need alternate elements → so use i += 2 in loop.
2. Start from index 0 → add arr[0], arr[2], arr[4], ...
3. Store them in ArrayList → return at the end.
*/
