package algorithm;
/* 주어진 데이터 중 가장 큰 값
 *
 * 최대값 알고리즘 - MaxAlgorithm : (주어진 범위 + 주어진 조건) 자료들의 가장 큰 값 구하기
 */

public class MaxAlgorithm {

    public static void main(String[] args) {

        // [0] Initialize
        int max = Integer.MIN_VALUE; // 정수 형식의 데이터 중 가장 작은 값으로 초기화

        // [1] Input :
        int[] numbers = {-2, -3, -5, -1, 55, -7};

        // [2] Process : MAX
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // MAX 더 큰 값으로 할당

            }
        }

        // [3] Output :
        System.out.println(numbers.length + "개의 수에서 최대값 : " + max);

    }
}
