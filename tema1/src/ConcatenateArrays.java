import java.awt.*;
import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8};
        int[] newArray = concatenate(a, b);
        System.out.println(Arrays.toString(newArray));
    }

    private static int[] concatenate(int[] a, int[] b) {
        int[] newArray = new int[a.length + b.length];
        int i = 0;
        int j = 0;

        while (i < a.length) {
            newArray[i] = a[i];
            i++;
        }
        while (j < b.length) {
            newArray[i] = b[j];
            j++;
            i++;
        }
        return newArray;
    }
}
