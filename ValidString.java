public class ValidString {
    public static boolean match(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false; // If the length is odd, it can't be valid
        }
        
        for (int i = 0; i < n / 2; i++) {
            char opening = s.charAt(i);
            char closing = s.charAt(n - i - 1); // Corresponding closing bracket
            
            if ((opening == '(' && closing != ')') ||
                (opening == '[' && closing != ']') ||
                (opening == '{' && closing != '}')) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String str = "{}() [{}]";
        System.out.println(match(str)); // Output: true
    }
}
