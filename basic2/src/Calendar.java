import java.util.Scanner;

public class Calendar {

    public final static int[] MaxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getMaxDays(int month) {
        return MaxDays[month - 1];
    }

    public static void main(String[] args) {

        System.out.println("일 월 화 수 목 금 토");
        System.out.println("==================");

        for (int i = 1; i < 8; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 8; i < 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 15; i < 22; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------");

        Scanner scanner = new Scanner(System.in);
        Calendar cal = new Calendar();

        System.out.println("달을 입력하세요");
        int month = scanner.nextInt();

        System.out.printf("%d월은 %d일까지입니다.", month, MaxDays[month]);

        System.out.println();
        scanner.close();
    }
}
