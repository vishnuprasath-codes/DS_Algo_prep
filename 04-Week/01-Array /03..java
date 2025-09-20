class Solution {
    public static int largest(int[] arr) {
        // Assume the first element is the largest initially
        int largest = arr[0];

        // Loop through the rest of the array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            // If current element is greater than or equal to 'largest'
            if (arr[i] >= largest) {
                // Update 'largest' with current element
                largest = arr[i];
            }
        }

        // Return the largest element found
        return largest;
    }
}
