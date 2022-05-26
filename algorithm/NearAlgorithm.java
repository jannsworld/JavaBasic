package algorithm;

/* [?] 원본 데이터 중에서 대상 데이터와 가장 가까운 값
 *
 * 근삿값 알고리즘 (Near Algorithm) : 차이값의 절대값의 최소값
 */
public class NearAlgorithm {

    public static int Abs(int number) {

        return (number < 0) ? -number : number;
    }

    public static void main(String[] args) {

        // [0] Initialize

        int min = Integer.MAX_VALUE; // 차잇값의 절대값의 최솟값

        // [1] Input :
        int[] numbers = {10, 20, 30, 27, 20, 17};
        int target = 25; // target과 가까운 값
        int near = 0; // 가까운 값

        // [2] Process :\
        for (int i = 0; i < numbers.length; i++) {
            int abs = Abs(numbers[i] - target); //차잇값의 절대값
            if (abs < min) {
                min = abs; // MIN : 최솟값 알고리즘
                near = numbers[i]; // NEAR : 차잇값의 절대값의 최솟값

            }
        }

        // [1] Output :
        System.out.println(target + "와 가장 가까운 값 :" + near + "(차이 :" +min +")");
    }
}
