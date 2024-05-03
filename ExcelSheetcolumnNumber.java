public class ExcelSheetcolumnNumber {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            sb.insert(0, (char) ('A' + rem));
            columnNumber = columnNumber / 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int columnNumber1 = 1;
        int columnNumber2 = 18;
        int columnNumber3 = 122;

        System.out.println(convertToTitle(columnNumber1)); // Output: 1
        System.out.println(convertToTitle(columnNumber2)); // Output: 27
        System.out.println(convertToTitle(columnNumber3)); // Output: 28
    }
}
