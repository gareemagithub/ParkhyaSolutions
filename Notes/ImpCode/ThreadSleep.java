package IMP;

public class ThreadSleep {
    public static void main(String[] args) {
        // Create an array with 15 elements
        int[] arr = new int[15];
        
        // Fill the array with values 1 to 15
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        
        // Print 3 elements at a time with a 2-second delay
        printElementsInChunks(arr, 3, 2000); // 2000 ms = 2 seconds
    }
    public static void printElementsInChunks(int[] arr, int chunkSize, int delay) {
        for (int i = 0; i < arr.length; i += chunkSize) {
            // Print the current chunk of elements
            for (int j = i; j < i + chunkSize && j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println(); // Move to the next line after each chunk
            
            try {
                // Sleep for the given delay time (2 seconds)
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
