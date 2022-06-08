/* [?] 각 후보자가 얻은 투표 수, 최대 최소 득표자
 *
 * 배열에서 가장 큰 값(최댓값)을 반복문없이 Sort 이용해 찾기
 *  오름차순 정렬시, 배열 첫 번째 최솟값, 배열 마지막 값 최댓값
 */

// ar 배열 가장 적은 득표 수, 가장 많은 득표 수 구하기

import java.util.Arrays;

class Solution {
    public void solutionMethod(int n, int[] vote_box) {
        // [1] ar(득표 수) 배열 선언 : 정수형 배열 0으로 초기화 되어지기에 처음 후보자 모두 0득표 초기화
        // 후보자 1번 부터 있고, 0번 후보는 없기에 (후보자 수 +1) == 배열의 크기
        int[] ar = new int[n + 1];

        // [2] vote_box 배열 반복문 돌면서 각 후보자별로 표 받은 득표 수 계산 -> ar 배열 득표한 수 저장
        for (int i = 0; i < vote_box.length; i++)
            ar[vote_box[i]]++;

        // [3] 각 후보자 득표 수 출력 : 득표 수 저장 배열 : ar[]
        for (int i = 1; i < ar.length; i++)
            System.out.println(i + "번 후보 : " + ar[i] + "표");

        // [4] ar 배열에서 다득표자와 후보자 번호 출력 : 최댓값 알고리즘
        // max 변수 0 또는 ar 배열 첫 번째 값 셋팅하고, 반복문을 돌면서 각 요소와 맥스값을 비교하며 더 큰 값 저장
        // 0번 후보자 배열 0번은 항상 0이므로 1부터 순회
//        int rst_candidate = 0, rst_max = ar[0];
//        for (int i = 1; i < ar.length; i++) {
//            if (ar[i] > rst_max) {
//                rst_max = ar[i];
//                rst_candidate = i;
//            }
//        }
//        System.out.println("가장 많은 득표 수 :" + rst_max + ", 가장 많은 득표 자 :" + rst_candidate + "번 후보자");

        // [4-1] ar 배열 가장 적은 득표 수, 가장 많은 득표 수 구하기
        // sort 함수 -오름차순(기본) 정렬
        Arrays.sort(ar);
        System.out.println("가장 적은 득표 수(최솟값) :" + ar[1]);
        System.out.println("가장 많은 득표 수(최댓값) :" + ar[ar.length - 1]);
        int rst_max = ar[ar.length - 1];

        // [5] 과반 수 여부 체크
        boolean majority = rst_max > (vote_box.length / (double) 2);
        if (majority)
            System.out.println("과반수 이상 득표 -> 당선");
        else
            System.out.println("과반수 이상 실패 -> 미당선");

    }
}

public class SortMax {
    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] vote_box = {1, 3, 1, 3, 3, 2, 2};

        s1.solutionMethod(3, vote_box);
    }
}
