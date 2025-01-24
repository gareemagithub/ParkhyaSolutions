package Array;

public class MaxSubArrSum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = 0;

        for (int num : nums) {
            currentSum += num; // Add the current number to the running sum
            if (currentSum > maxSum) {
                maxSum = currentSum; // Update the maxSum if currentSum is larger
            }
            if (currentSum < 0) {
                currentSum = 0; // Reset currentSum if it goes negative
            }
        }
        return maxSum; // Return the largest sum found
    }
}
