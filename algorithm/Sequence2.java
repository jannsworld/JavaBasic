package algorithm;

public class Sequence2 {

    public static void main(String[] args) {
        double a =1.0;
        double b = 1.0;
        double sum = 0;
        for (b = 1.0; b <= 10; b++) {

            sum += a / (b);
            System.out.print(a + "/" + b + "  ");
        }
        System.out.println(" 의 합 : " + sum);
    }
}


