package algorithm;

/* 주어진 범위 내에서 불규칙적으로 나열되 순서를 일정 기준에 따라 순서대로 나열하는 알고리즘
 *
 * 정렬 알고리즘(Sort Algorithm) : 가장 작은(큰) 데이터를 왼쪽으로 순서대로 이동
 */
public class SelectionSortAlgorithm {

    public static void main(String[] args) {

        // [1] Input
        int[] data = {3, 2, 1, 5, 4};
        int N = data.length; // 의사코드 (슈도코드)형태로 알고리즘을 표현하기 위함

        // [2] Process : Selection Sort(선택정렬) 알고리즘
        for (int i = 0; i < N - 1; i++) { // i = 0 to N-1
            for (int j = i + 1; j < N; j++) { // j= i+1 to N
                if (data[i] > data[j]) { // 부등호 방향 :오름차순(>), 내림차순(<)
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp; // SWAP
                }
            }
        }

        // [1] Output
        for (int i = 0; i < N; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();

    }
}