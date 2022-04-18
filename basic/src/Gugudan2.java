import java.util.Scanner;

public class Gugudan2 {
    public static void main(String[] args) {

        System.out.println("출력한 구구단은 몇 단? ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("사용자 입력 값 : " + number);

        if (number < 2) {
            System.out.println("잘못 입력했습니다.");

        } else if (number > 9) {
            System.out.println("잘못 입력했습니다.");

        } else {
            for (int i = 1; i < 10; i++) {
                System.out.println(number * i);
            }
        }
    }
}
