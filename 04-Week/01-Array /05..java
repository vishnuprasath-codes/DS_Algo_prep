class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Initialize min and max with the first element of the array
        int maximum = arr[0];
        int minimum = arr[0];

        // Linear search for min and max values
        for (int i = 1; i < arr.length; i++) {   // start from 1 since arr[0] is already set
            if (arr[i] > maximum) {
                maximum = arr[i]; // update maximum
            }
            if (arr[i] < minimum) {
                minimum = arr[i]; // update minimum
            }
        }

        // Return min and max as a Pair object
        return new Pair<>(minimum, maximum);
    }
}
