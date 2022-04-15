// 1-30 까지의 수 중 홀수만 출력

public class Java_Pattern2_1 {
    public static void main(String[] args) {

        // 변수 선언
        int i = 1;

        // 반복문 돌면서 홀수인지 확인, 홀수면 continue(Pass)
        while (i <= 30) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
