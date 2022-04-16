// 특정 모양(5*5 중 가운데 별) 출력하기

public class Java_Pattern4 {
    public static void main(String[] args) {

        // 2차원 배열 행과 열 선언
        int R = 5, C = 5;

        // 2차원 char 배열 선언 및 요소 값 입력
        char[][] star = new char[][]{
                {'◇', '◇', '◇', '◇', '◇'},
                {'◇', '◇', '◇', '◇', '◇'},
                {'◇', '◇', '★', '◇', '◇'},
                {'◇', '◇', '◇', '◇', '◇'},
                {'◇', '◇', '◇', '◇', '◇'}
        };

        // 2차원 배열 요소 출력
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }
}
