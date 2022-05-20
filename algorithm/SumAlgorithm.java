package algorithm;

/* n명의 국어 점수 중에서 80점 이상인 점수의 합계
 * 합계 알고리즘 (SUM Algorithm) 주어진 범위에 주어진 조건에 해당하는 자료 합계
 */

public class SumAlgorithm {

    public static void main(String[] args) {
        // [1] Input
        int[] scores = {100, 75, 50, 37, 90, 95};
        int sum = 0;

        // [2] Process
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 80) {
                sum += scores[i];
            }
        }

        // [3] Output
        System.out.println(scores.length + "명의 점수 중 80점 이상의 총 점 :" + sum);
    }
}