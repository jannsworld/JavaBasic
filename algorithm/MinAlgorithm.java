package algorithm;

/* [?] 주어진 데이터 중에서 가장 작은 짝수 값 구하기
 *
 *  최소값 알고리즘 - MinAlgorithm : 주어진 데이터에서 가장 작은 값 구하기
 */
public class MinAlgorithm {

    public static void main(String[] args) {

        // [0] Initialize
        int min = Integer.MAX_VALUE; // 정수 형식의 데이터 중 가장 큰 값으로 초기화

        // [1] Input
        int[] numbers = {2, 5, 3, 7, 1};

        // [2] Process : MIN
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min && numbers[i] % 2 == 0) {
                min = numbers[i]; // MIN 더 작은 값으로 할당
            }
        }

        // [3] Output
        System.out.println(numbers.length + "개 수 중의 최소값: " + min);
    }
}
