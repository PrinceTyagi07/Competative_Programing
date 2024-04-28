import java.util.Scanner;
public class AjentVinodProblem{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        String originalMessage = decryptMessage(encryptedMessage);
        System.out.println(originalMessage);
        scanner.close();
    }

    public static String decryptMessage(String encryptedMessage) {
        int n = encryptedMessage.length();
        StringBuilder originalMessage = new StringBuilder();

        // Initialize two pointers for the left and right ends of the encrypted message
        int left = (n/2), right =(n/2)+1;

        // Decipher the message by alternating adding characters from left and right ends
        while (left > 0 || right<n) {
            // Append characters alternatively from left and right ends
            originalMessage.append(encryptedMessage.charAt(left));
           
            if (left != right) {
                originalMessage.append(encryptedMessage.charAt(right));
            }
            left--;
            right++;
        }

        return originalMessage.toString();
    }
}

