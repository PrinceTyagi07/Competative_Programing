public class solution {
    public static int lengthOfLastWord(String s) {
        // String trimmedString = s.trim();

        // Find the last occurrence of a whitespace
        // int lastSpaceIndex = trimmedString.lastIndexOf(' ');

        // Return the length of the last word
        // return trimmedString.length() - lastSpaceIndex - 1;

        // or we can do it without trim()

        int length = 0;
        boolean foundNonSpace = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                foundNonSpace = true;
                length++;
            } else if (foundNonSpace) {
                break;
            }
        }

        return length;
    }
    public static void main(String[] args) {
        

        String s1 = "Hello World";
        System.out.println("Length of last word in \"" + s1 + "\": " + lengthOfLastWord(s1));

        String s2 = "   Hello   ";
        System.out.println("Length of last word in \"" + s2 + "\": " + lengthOfLastWord(s2));

        String s3 = "Today is a nice day";
        System.out.println("Length of last word in \"" + s3 + "\": " + lengthOfLastWord(s3));
    }
}