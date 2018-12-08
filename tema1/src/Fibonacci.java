public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(20);
    }
    private static void fibonacci(int nr) {
        int i = 1;
        int prev = 0;
        int next;
        int sum = 1;
        float average;
        int range = nr;

        if (nr == 1) {
            System.out.print(i);
            System.exit(0);
        }
        if (nr == 0) {
            System.exit(0);
        }
        System.out.print(i);

        while (range > 1) {
            System.out.print(" ");
            next = i + prev;
            sum += next;
            prev = i;
            i = next;
            System.out.print(next);
            range--;
        }
        average = sum / (float)nr;
        System.out.println();
        System.out.println(average);
    }
}
