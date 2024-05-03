// LeetCode--125. Valid Palindrome

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

import java.util.Scanner;

public class Valid_Palindrome {
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder("");
      
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                if( str.isEmpty()==true){
                    return true;
                }else
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(sb);
        str = sb.toString();
        System.out.println(str);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String str = "A man, a plan, a canal: Panama";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter new String ");
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
