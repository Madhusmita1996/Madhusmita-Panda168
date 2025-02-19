public class BinaryAddition {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b
        int carry = 0;

        // Loop until both strings are processed or carry is non-zero
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Add bit from string a
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Add bit from string b
                j--;
            }

            // Append the current bit to the result
            result.append(sum % 2); // The current bit (0 or 1)
            carry = sum / 2; // Carry for the next iteration
        }

        // The result is in reverse order, so reverse it before returning
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";  // Example binary string
        String b = "1101";  // Example binary string
        System.out.println("Sum of " + a + " and " + b + " is: " + addBinary(a, b));
    }
}