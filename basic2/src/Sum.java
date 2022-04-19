import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        int a, b;
        Scanner sc = new Scanner(System.in);
        String s1, s2;

        System.out.println("숫자를 두개를 입력해주세요");

        s1 = sc.next();
        s2 = sc.next();
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);

        // 두 수의 합 출력
        System.out.printf("두 수의 합은 %d입니다.", a + b);

    }
}
