// scores = {88, 50, 35, 100, 91, 100, 99, 61}; ranking, 순위 매기기

public class Java_OrderRanking {
    public static void main(String[] args) {

        // 배열 선언 - 1성적, 2순위 배열 두가지
        int[] scores = {88, 50, 35, 100, 91, 100, 99, 61};
        int s_len = scores.length;
        int[] ranking = new int[s_len]; // 성적의 갯수만큼 순위도 생성

        for (int i = 0; i < s_len; i++) {

            ranking[i] = 1; // 랭킹 전부 1등으로 초기화

            for (int j = 0; j < s_len; j++) {
                if (scores[i] < scores[j]) {
                    ranking[i]++; // scores[i]와 scores[j]값을 각각 비교 후, [j] 해당 값이 더 큰 경우, [i]순위 +1
                }
            }
        }

        // 점수와 순위 함께 출력
        System.out.println("총 " + s_len + "명 학생의 점수와 순위는 ?");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("점수 : " + scores[i] + " 순위 : " + ranking[i]);
        }
    }
}
