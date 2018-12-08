public class FindSubstring {
    public static void main(String[] args) {
        String str = "Hello java world";
        String subStr = "java";
        System.out.println(findSubstring(str, subStr));
    }

    private static boolean findSubstring(String str, String subStr) {
        boolean result = false;
        if (str.contains(subStr)) {
            result = true;
        }
        return result;
    }
}
