package algorithm;

public class Sequence1 {
    public static void main(String[] args) {

        double i;
        double h =0;

        for (i = 1; i < 11; i++) {

            h += i / (i+1);

            System.out.print( i + "/" + (i+1) + "  ");
        }
        System.out.println("합은 :" + h  );
    }
}
