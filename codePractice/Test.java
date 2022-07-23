package codePractice;

public class Test {
    public static void main(String args[]) {
        int[] a = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        int b = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 3) {
                b++;
            }
        }

        System.out.println(b);
    }
}