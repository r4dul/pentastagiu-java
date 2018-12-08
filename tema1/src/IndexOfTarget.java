public class IndexOfTarget {
    public static void main(String[] args) {
        int[] array = {13,20,14,5,2,8};
        int target = 5;
        // return -1 if not found.
        System.out.println(returnTarget(array, target));
    }

    public static int returnTarget(int[] a, int target) {
        int index = 0;
        int len = a.length;
        int foundAt = -1;

        while (index < len) {
            if (a[index] == target) {
                foundAt = index;
                return foundAt;
            } else {
                index++;
            }
        }
        return foundAt;
    }
}
