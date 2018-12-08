public class CharacterCount {
    public static void main(String[] args) {
        char ch = 'a';
        String str = "Hello java world";
        System.out.println(characterCount(str, ch));
    }

    private static int characterCount(String str, char ch) {
        int i = 0;
        int len = str.length();
        int count = 0;
        char[] charArray = str.toCharArray();

        while(i < len) {
            if (charArray[i] == ch) {
                count++;
            }
            i++;
        }
        return count;
    }
}
