public class AddHashtag {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(addHashtag(str));
    }

    private static String addHashtag(String str) {
        int len  = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        String newStr = "";
        newStr += charArray[i];

        while (i < len - 1) {
            //checking if characer is a letter so we won't place '#' between spaces for example
            if (charArray[i] == charArray[i + 1] && ((charArray[i] >= 'a' && charArray[i] <= 'z') || (charArray[i] >= 'A' && charArray[i] <= 'Z'))) {
                newStr += "#";
            }
            newStr += charArray[i + 1];
            i++;
        }
        return newStr;
    }
}
