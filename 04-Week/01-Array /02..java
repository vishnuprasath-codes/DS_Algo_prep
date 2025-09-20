class Solution {
    public int[] countOddEven(int[] arr) {
        // Initialize counters for odd and even numbers
        int odd = 0;
        int even = 0;

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is even
            if (arr[i] % 2 == 0) {
                even += 1; // Increment even counter
            } else {
                odd += 1; // Increment odd counter
            }
        }

        // Return an array containing {odd count, even count}
        return new int[]{odd, even};
    }
}
