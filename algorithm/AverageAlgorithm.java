package algorithm;

/* n명의 점수 중에서 80점 이상 95점 이하인 점수의 평균
 *
 *  평균 알고리즘 : 주어진 범위에서 주어진 조건에 해당하는 자료들의 평균
 */

public class AverageAlgorithm {

    public static void main(String[] args) {

        // [1] Input : n명의 성적
        int[] data = {90, 65, 78, 50, 95};
        int sum = 0; //합계
        int count = 0; // 개수

        // [2] Process : AVG = SUM / COUNT
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 80 && data[i] <= 95) {
                sum += data[i];
                count++;
            }
        }
        double avg = sum / (double) count;

        // [3] Output :
        System.out.println(data.length + "명의 성적 중 80점 이상 95점 이하인 자료의 평균 :" + avg);
    }
}
