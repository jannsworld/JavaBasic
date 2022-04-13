// scores = {88, 50, 35, 100, 91, 100, 99, 61}; ranking, 오름차순으로 정렬헤 순위 매기기


import java.util.Arrays;
import java.util.Collections;

public class Java_OrderRankingAscending {
    public static void main(String[] args) {

        int [] scores = {88, 50, 35, 100, 91, 100, 99, 61};
        int s_len = scores.length;
        int[] ranking = new int[s_len];

        Arrays.sort(scores); // 점수를 오름차순으로 먼저 정렬

        for (int i = 0; i < s_len; i++) {
            ranking[i] = 1; // 모든 순위를 1로 초기화

            for (int j = 0; j < s_len; j++) {
                if (scores[i] < scores[j]) { // scores 반복 비교해 순위 매기기
                    ranking[i]++;
                }
            }

        }

        // 출력
        System.out.println("총 "+ s_len +"명 학생의 점수를, 낮은 점수부터 출력하고 순위를 구하면 ?");

        for (int i = 0; i < s_len; i++) {
            System.out.println("점수 :" + scores[i] + " 순위 : " + ranking[i]);

        }


    }
}
