public class AlphabetEncoding {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(alphabetEncoding(str));
    }

    private static String alphabetEncoding(String str) {
        int i = 0;
        int len = str.length();
        char[] charArray = str.toCharArray();
        int index;
        String newStr = "abcdefghijklmnopqrstuvwxyz";
        String result = "";

        while (i < len) {
            index = newStr.indexOf(charArray[i]);
            result += index;
            i++;
        }

        return result;
    }
}
