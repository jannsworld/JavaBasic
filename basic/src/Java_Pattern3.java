// 짝수만, 5*5 형태로 출력

public class Java_Pattern3 {
    public static void main(String[] args) {

        // 이중 반복문
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {

                // 출력값
                int result = i * 10 + j;

                // 짝수만 출력
                if (result % 2 != 0) {
                    continue;
                } else {
                    System.out.print(result + " ");
                }
            }
            System.out.println();
        }
    }
}
