import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {

        int max;
        System.out.println(" 두 수 입력 받아 더 큰 수 출력하기 ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하시오 :");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하시오 :");
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);

    }
}
