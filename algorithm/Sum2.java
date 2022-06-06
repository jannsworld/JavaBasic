package algorithm;

public class Sum2 {

    public static void main(String[] args) {
        double i;
        double s = 1;
        System.out.print("1 ");
        for (i = 1; i <= 10; i++) {
            s = s + 1 / i;
            System.out.print(" +1/" + i);
        }
        System.out.println();
        System.out.format("누적값 : " + s);
    }
}

