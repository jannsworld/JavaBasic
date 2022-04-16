// Pattern3에서 0, 10, 20, 30, 40 값만 출력

public class Java_Pattern3_1 {
    public static void main(String[] args) {

       loop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                int result = i * 10 + j;

                if (result % 2 != 0) {

                    // j=1이면 바깥쪽 for문으로 다시 수행
                    if (j == 1) {
                        System.out.println();
                        continue loop;
                    }
                    continue;
                } else {
                    System.out.print(result + "  ");
                }
            }
            System.out.println();
        }
    }
}
