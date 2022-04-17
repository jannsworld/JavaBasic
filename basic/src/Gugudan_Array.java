
public class Gugudan_Array {
    public static void main(String[] args) {

        // 2차원 배열 선언
        int[][] gugudan = new int[10][10];
        for (int i = 2; i < gugudan.length; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < gugudan[i].length; j++) {
                gugudan[i][j] = i * j;

                System.out.println(i + " * " + j + " = " + gugudan[i][j] + " ");

            }
        }
    }
}