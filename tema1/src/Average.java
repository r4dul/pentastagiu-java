public class Average {
    public static void main(String[] args) {
        System.out.println(sum(1, 100));
        System.out.println(average(1, 100));
    }
    private static int sum(int a, int b){
        int sum = 0;
        while (a <= b) {
            sum += a;
            a++;
        }
        return sum;
    }

    private static float average(int a, int b) {
        float av = 0;
        int sum = 0;
        int range = b - a + 1;

        while (a <= b) {
            sum += a;
            a++;
        }
        av = sum / (float)range;
        return av;
    }
}
