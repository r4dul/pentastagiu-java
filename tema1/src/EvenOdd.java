public class EvenOdd {
    public static void main(String[] args) {
        int[] a = {13,20,14,5,2,8};
        System.out.println("Odd elements count : " + oddElements(a));
        System.out.println("Even elements count : " + evenElements(a));
    }
    private static int oddElements(int[] a) {
        int odd = 0;
        int len = a.length;
        int i = 0;

        while(i < len) {
            if (a[i] % 2 == 1) {
                odd++;
            }
            i++;
        }
        return odd;
    }

    private static int evenElements(int[] a) {
        int even = 0;
        int len = a.length;
        int i = 0;

        while(i < len) {
            if (a[i] % 2 == 0) {
                even++;
            }
            i++;
        }
        return even;
    }
}
