public class EndStringCheck {
    public static void main(String[] args) {
        String str1 = "Hello java world";
        String str2 = "orld";
        System.out.println(endTest(str1, str2));
    }

    private static boolean endTest(String str1, String str2) {
        boolean result = false;
        int len1 = str1.length();
        int len2 = str2.length();

        if (len2 > len1) {
            return result;
        }

        int index = str1.indexOf(str2);
        if (index + len2 == len1) {
            result = true;
        }
        return result;
    }
}
