import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        System.out.println("출력할 구구단은 몇 단? :");
        // 사용자가 정수값을 입력하면, 해당 하는 구구단 출력

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number * 1);
        System.out.println(number * 2);
        System.out.println(number * 3);
        System.out.println(number * 4);
        System.out.println(number * 5);
        System.out.println(number * 6);
        System.out.println(number * 7);
        System.out.println(number * 8);
        System.out.println(number * 9);

    }
}