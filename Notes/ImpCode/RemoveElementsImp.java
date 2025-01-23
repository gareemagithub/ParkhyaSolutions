package IMP;

import java.util.HashSet;

public class RemoveElementsImp {
     public static void main(String[] args) {
        // Initialize the array with the given values
        int[] arr = {1, 1, 1, 2, 2, 5, 0, 0, 6};
        
        removeElements(arr);
    }

    public static void removeElements(int[] arr) {
        int count = 0;
        int size = arr.length; // Initial size of the array

        // Continue until the array is empty
        while (size > 0) {
            HashSet<Integer> removedElements = new HashSet<>();

            // Iterate over the array to process the elements
            for (int i = 0; i < size; i++) {
                int currentElement = arr[i];

                // If the element has not been removed yet
                if (!removedElements.contains(currentElement)) {
                    // Mark this element as removed
                    removedElements.add(currentElement);

                    // Remove all occurrences of the current element
                    int newIndex = 0;
                    for (int j = 0; j < size; j++) {
                        if (arr[j] != currentElement) {
                            arr[newIndex++] = arr[j];  // Shift the element left
                        }
                    }

                    // Update the size after removal
                    size = newIndex;

                    // Increment the removal count
                    count++;

                    // Exit this loop to start with the next distinct element
                    break;
                }
            }
        }

        // Output the number of times the array was modified until empty
        System.out.println("Array is empty after " + count + " removals.");
    }
}
