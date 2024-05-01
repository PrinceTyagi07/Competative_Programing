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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        // System.out.println("Enter a String : ");
        String str = sc.nextLine();
        sc.close();
        System.out.println(Palindrome(str));

    }
}
