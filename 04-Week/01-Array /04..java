import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // Initialize min and secondMin with maximum possible values
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // Traverse through the array
        for (int num : arr) {
            // If current number is smaller than min
            if (num < min) {
                // Update secondMin first, then min
                secondMin = min;
                min = num;
            }
            // If current number is between min and secondMin (not equal to min)
            else if (num > min && num < secondMin) {
                secondMin = num;
            }
        }

        // Prepare result list
        ArrayList<Integer> result = new ArrayList<>();

        // If secondMin is not updated, it means there is no distinct second min
        if (secondMin == Integer.MAX_VALUE) {
            result.add(-1); // As per many coding platform conventions
        } else {
            result.add(min);
            result.add(secondMin);
        }

        // Return result
        return result;
    }
}
