import java.lang.reflect.Array;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {13,6,2,8,2,3};
        int[] array2 = {13,6,2,8,2,13};
        System.out.println(checkInt(array));
        System.out.println(checkInt(array2));
    }

    private static boolean checkInt(int[] array) {
        if (array[0] == array[array.length -1]) {
            return true;
        } else {
            return false;
        }
    }
}
