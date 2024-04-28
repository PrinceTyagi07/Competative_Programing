import java.util.Scanner;

public class PalindromeString {

    public static String Palindrome(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            output += str.charAt(i);
        }
        if (output.equals(str)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    // Overloaded method for integer arguments
    public static String Palindrome(Integer num) {
        int original = num;
        int reversed = 0;

        // If it has only one digit
        if (num < 10) {
            return "No";
        }

        // Reverse the integer
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // Check if the reversed integer is equal to the original integer
        if (reversed == original) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String or an Integer: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(Palindrome(num));
        } else {
            String str = sc.nextLine();
            System.out.println(Palindrome(str));
        }
        sc.close();
    }
}
