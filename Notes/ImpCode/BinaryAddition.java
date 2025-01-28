package Extra;

public class BinaryAddition {
    public static void main(String[] args) {
        String a = "101";
        String b = "110";
        
        String result = addBinaryStrings(a, b);
        System.out.println("Sum: " + result);  // Output will be "1011"
    }

    public static String addBinaryStrings(String a, String b) {
        // Initialize result and carry
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        // Start from the end of both strings
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        // Loop until both strings are processed and there's no carry left
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            
            // Add current digits from both strings if they exist
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            // Determine the result digit and carry
            if (sum == 0) {
                result.append('0');
                carry = 0;
            } else if (sum == 1) {
                result.append('1');
                carry = 0;
            } else { // sum == 2 (1 + 1)
                result.append('0');
                carry = 1;
            }
        }
        
        // The result string is built in reverse, so we reverse it before returning
        return result.reverse().toString();
    }

}
