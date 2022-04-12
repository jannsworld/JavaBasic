// 정렬 함수로 주어진 성적 오름차순으로 정렬

import java.util.Arrays;

public class Java_Score {
    public static void main(String[] args) {

        // 배열 선언
        int[] scores = {88, 50, 35, 100, 91, 100, 99, 61};

        // 오름차순 정렬 : Arrays.sort(배열명)
//        System.out.print(Arrays.sort(scores));
        System.out.print("정렬 전 성적 :");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "  ");
        }
        System.out.println();
        Arrays.sort(scores);

        System.out.print("정렬 후 점수 :");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "  ");
        }
        System.out.println();
        System.out.print("향상된 for문 :");
        for(int i:scores){
            System.out.print(i + "  ");
        }
    }
}
