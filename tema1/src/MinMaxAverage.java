public class MinMaxAverage {
    public static void main(String[] args) {
        int[] array = {13,20,14,5,2,8};
        System.out.println("Max: " + maxNumber(array));
        System.out.println("Min: " + minNumber(array));
        System.out.printf("Average: %.1f", averageNumber(array));
    }

    private static int maxNumber(int[] a) {
        int i = 0;
        int max = a[i++];
        int len = a.length;

        while(i < len) {
            if (max < a[i]) {
                max = a[i];
            }
            i++;
        }
        return max;
    }

    private static int minNumber(int[] a) {
        int i = 0;
        int min = a[i++];
        int len = a.length;

        while(i < len) {
            if (min > a[i]) {
                min = a[i];
            }
            i++;
        }
        return min;
    }

    private static float averageNumber(int[] a) {
        float average;
        int sum = 0;
        int i = 0;
        int len = a.length;

        while (i < len) {
            sum += a[i];
            i++;
        }
        average = sum / (float)len;
        return average;
    }
}
