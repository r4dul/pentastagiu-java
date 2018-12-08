public class EqualityCheck {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4};
        int[] arrayB = {};
        int[] arrayC = {1,3,2};
        int[] arrayD = {1,3};
        int[] arrayE = {1,2,3,4};
        int[] arrayF = {1,2,4,3};

        System.out.println(checkEquality(arrayA, arrayA));
        System.out.println(checkEquality(arrayB, arrayB));
        System.out.println(checkEquality(arrayC, arrayD));
        System.out.println(checkEquality(arrayE, arrayF));
    }

    private static boolean checkEquality(int[] a, int[] b) {
        int i = 0;
        int len = a.length;
        if (a.length == 0 && b.length == 0) {
            return true;
        }
        if (a.length != b.length) {
            return false;
        }
        while(i < len) {
            if (a[i] == b[i]) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
