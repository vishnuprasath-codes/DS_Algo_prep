

import javafx.util.Pair; // Import Pair class

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Initialize min and max with the first element of the array
        int maximum = arr[0];
        int minimum = arr[0];

        // Traverse the entire array to find min and max
        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than maximum, update maximum
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            // If current element is smaller than minimum, update minimum
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        // Return the result as a Pair object: (min, max)
        return new Pair<>(minimum, maximum);
    }
}
