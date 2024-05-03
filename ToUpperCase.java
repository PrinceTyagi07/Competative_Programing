public class ToUpperCase {
    public static String uppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length() ; i++) {
            if (str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i) );
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);

            }
            else {

                sb.append(str.charAt(i));
            }
        }
    str=sb.toString();
    return str;
    }

    public static void main(String[] args) {
        String str = "hi, how are you";
System.out.println(uppercase(str));
    }
}
