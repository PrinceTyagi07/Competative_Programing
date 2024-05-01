// leetcode problem 66;
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // Start with carry as 1 to represent adding 1
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // Update the current digit with the modulo 10 of the sum
            carry = sum / 10; // Update carry for the next iteration
        }

        // If carry is still 1 after all iterations, it means we need to add an extra digit
        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1; // Set the first digit to 1
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[] result = plusOne(nums);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
