package algorithm;

/*  [?] 주어진 데이터에서 가장 많이 나타난(중복된) 값
 * Mode Algorithm 최빈값 알고리즘 : 점수 인덱스의 개수 (Count)
 */
public class ModeAlgorithm {
    public static void main(String[] args) {

        // [1] Input
        int[] scores = {1, 3, 3, 2, 5};
        int[] idx = new int[5 + 1];
        int max = Integer.MIN_VALUE; // MAX
        int mode =0; // 최빈값이 담길 그릇

        // [2] Process
        for (int i = 0; i < scores.length; i++) {
            idx[scores[i]]++; // COUNT
        }
        for (int i = 0; i < idx.length; i++) {
            if (idx[i] > max) {
                max = idx[i]; // MAX
                mode = i; // MODE

            }
        }
        // [3] Output
        System.out.println( "최빈값 :"+ mode + "," + max + "번");
    }
}
